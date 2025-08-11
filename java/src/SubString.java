package com.example.leetCode;

import java.util.Set;

public class SubString {
    public static void main(String[] args) {

        String str = "abcabcbb";
        possibleSubString(str);
        longestSubString(str);
    }

    private static void possibleSubString(String str) {

        int n = str.length(), count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {

                System.out.println(str.substring(i, j));
                count++;
            }
        }

    }

    private static void longestSubString(String str){

        int start = 0, end = 0;
        int maxLength = 0;
        // String maxLength = "";

        Set<Character> charSet = new java.util.HashSet<>();
        while(end<str.length()){
            if(!charSet.contains(str.charAt(end))){
                charSet.add(str.charAt(end));
                end++;
                maxLength = Math.min(maxLength, end-start);
            }else{
                charSet.remove(str.charAt(start));
                start++;
            }

        }  
        System.out.println(maxLength);
        
        
    }

}