package com.example.leetCode;

import java.util.HashMap;
import java.util.Map;


public class RemoveDuplicateElements {

    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        // System.out.println(majorityElement(arr));
         Map<Integer,Integer> entryMap = new HashMap<>();
        for(int i : arr){
            if(!entryMap.containsKey(i)){
                entryMap.put(i, 1);
            }else{
                entryMap.put(i, entryMap.getOrDefault(entryMap, i+1));
            }
        }

        int max = entryMap.values().stream()
        .mapToInt(Integer::valueOf)
        .max()
        .orElse(0);

        System.out.println(max);
    }

    // public static int majorityElement(int[] nums) {
    //    Map<Integer,Integer> entryMap = new HashMap<>();
    //     for(int i : nums){
    //         if(!entryMap.containsKey(i)){
    //             entryMap.put(i, 1);
    //         }else{
    //             entryMap.put(i, entryMap.getOrDefault(entryMap, i+1));
    //         }
    //     }

    //     System.out.println(entryMap);

    }
    
// }
