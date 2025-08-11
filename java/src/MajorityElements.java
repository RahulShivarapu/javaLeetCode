package com.example.leetCode;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MajorityElements {

    public static void main(String[] args) {
        int[] arr = {3,2,3};

      Optional<Map.Entry<Integer,Long>> majorityElement = Arrays.stream(arr).boxed()
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
        .entrySet()
        .stream()
        .max(Map.Entry.comparingByValue());
        
       majorityElement.ifPresent(n->System.out.println(n.getKey()+" "));
    }
}
