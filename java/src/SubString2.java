package com.example.leetCode;

public class SubString2 {

    public static void main(String[] args) {
        String s = "abcabcbb";
        int n= s.length();
        for(int i = 0; i < n ;i++ ){
            for(int j= i+1; j< n; j++){
                System.out.println(s.substring(i, j));
            }
        }
    }
}
