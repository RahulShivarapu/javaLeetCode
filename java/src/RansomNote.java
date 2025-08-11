package com.example.leetCode;

import java.util.HashMap;
import java.util.Map;
// import java.util.function.Function;

public class RansomNote {
    public static void main(String[] args) {
        String ransomNote = "aa", magazine = "ab";

        System.out.println(canConstruct(ransomNote, magazine));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
     
        Map<Character,Integer> magazineMap = new HashMap<>();
        for(char c: magazine.toCharArray()){
            magazineMap.put(c, magazineMap.getOrDefault(c,0)+1);
        }
        for(char c : ransomNote.toCharArray()){
            if(!magazineMap.containsKey(c) || magazineMap.get(c)<=0 ){
                return false;
            }

            magazineMap.put(c, magazineMap.get(c)-1);     // This line is necessary to keep track of the number of characters left in the magazine
        }
        return true;
    } 

}
