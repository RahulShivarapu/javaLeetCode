package com.example.leetCode;

// import java.util.Arrays;

public class RevereseSentense {
    public static void main(String[] args) {
        String str = "a good   example";
        System.out.println(reverseWords(str));
        
    }
 public static String reverseWords(String s) {
        String[] arr = s.replaceAll("\\s+\\s+"," ").split(" ");
        // Arrays.stream(arr).forEach(System.out::println);

        StringBuilder sb = new StringBuilder();
        // String res = "";
        for(int i = arr.length-1;i>=0;i-- ){
            sb.append(arr[i]+" "); 
        }
        return sb.toString().trim();
        // return "";
    }
}
