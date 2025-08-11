package com.example.leetCode;

import java.util.HashMap;
import java.util.Map;

public class MajElement {
    public static void main(String[] args) {
        int[] arr = {3,2,3};
        Map<Integer,Integer> entryMap = new HashMap<>();
        for(int i : arr){
            if(entryMap.containsKey(i)){
                entryMap.put(i,entryMap.get(i)+1);
            }else{
                entryMap.put(i, 1);
            }
        }

        System.out.println(entryMap);

        int maxValue= Integer.MIN_VALUE;
        int maxKey = Integer.MIN_VALUE;

        for(Map.Entry<Integer,Integer> map : entryMap.entrySet()){
            if(map.getValue()>maxValue){
                maxKey =  map.getKey();
                maxValue = map.getValue();
            }
        }
        System.out.println(maxKey +":"+ maxValue);
    }

}
