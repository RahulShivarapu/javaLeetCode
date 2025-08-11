// package com.example.leetCode;

public class ClimblingStairs {
public static void main(String[] args) {
    int n=5;
    System.out.println(climbStairs(n));
}
public static int climbStairs(int n) {
        int a=3, b=2;
        if(n<=3){
            return n;
        }
        for(int i=3;i<n;i++){
            a= a+b;
            b=a-b;
        }
        return a;
    }
}
