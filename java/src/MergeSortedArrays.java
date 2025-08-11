package com.example.leetCode;

public class MergeSortedArrays {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {2,3,4,5,6};

        int[] mergedArray = mergeSortedArrays(arr1, arr2);
        System.out.print("[");
        for(int i : mergedArray){
            
            System.out.print(i+",");
        }
        System.out.print("]");
    }
    public static int[] mergeSortedArrays(int[] num1, int[] num2){
        int[] res = new int[num1.length+num2.length];
        int i=0,j=0,k=0;
        while(i<num1.length&&j<num2.length){
            if(num1[i]<=num2[j]){
                res[k++]=num1[i++]; 
            }else{
                res[k++]= num2[j++];
            }
        }
        while (i<num1.length) {
            res[k++] = num1[i++];
        }
        while (j<num2.length) {
            res[k++] = num2[j++];
        }

        return res;
    }
}
