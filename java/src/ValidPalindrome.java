package com.example.leetCode;

// import com.netflix.spectator.impl.PatternExpr.Regex;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s ="A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        String newString =  s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        System.out.println(newString);
        for(int i=0;i<newString.length()/2;i++){
            if(newString.charAt(i) != newString.charAt(newString.length()-1-i)){
                return false;
            }
        }


        return true;

        
    }

}
