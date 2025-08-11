package com.example.leetCode;

public class LengthOfLastWord {

    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";

        System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {
        // String[] slist= s.trim().split(" ");
        // // for(String i : slist){
        // //     System.out.println(i);
        // // }
        // String lastWord = slist[slist.length-1];
        // // System.out.println(lastWord);
        // return lastWord.length();
        
        if(s.length()==0){
            return 0;
        }
        int i= s.length()-1;
        while(i>=0&&s.charAt(i)== ' '){
            i--;
        }
        int count = 0;
        while(i>=0 && s.charAt(i) != ' '){
        count++;
        i--;
        }

        return count;
    }
}
