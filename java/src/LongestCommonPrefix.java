package com.example.leetCode;

import java.util.Arrays;

public class LongestCommonPrefix {
 public static void main(String[] args) {
    String[] strs = {"rac","racecar","rack"};
    System.out.println(longestCommonPrefix(strs));
 }
 public static String longestCommonPrefix(String[] strs) {
    Arrays.sort(strs);
    String s1= strs[0];
    String s2 = strs[strs.length-1];

    int ind =0;
    while(ind<s1.length()&&ind<s2.length()){
        if(s1.charAt(ind)== s2.charAt(ind)){
            ind++;
        }else{
            break;
        }
    }
    return s1.substring(0, ind);
 }
}
