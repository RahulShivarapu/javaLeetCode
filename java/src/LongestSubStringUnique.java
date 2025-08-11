package com.example.leetCode;

// import java.util.ArrayList;
import java.util.HashSet;
// import java.util.List;
import java.util.Set;

public class LongestSubStringUnique {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int start =0,end = 0,maxLength=0;
        
        Set<Character> set = new HashSet<>();
        while(end<s.length()){
            if(!set.contains(s.charAt(end))){
                set.add(s.charAt(end));
                end++;
                maxLength = Math.max(maxLength, end-start);
            }else{
                set.remove(s.charAt(start));
                start++;
            }
        }
        System.out.println("Lenght of longest unique subString of "+ s+" : "+ maxLength);
        // print all possible subString
        
    }

}
