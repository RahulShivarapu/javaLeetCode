package com.example.leetCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
// import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ReverseSentence {
    public static void main(String[] args) {
        String str = " my name is rahul ";
        // System.out.println(str);
        List<String> list = Arrays.asList(str.trim().split(" "));
        System.out.println(list);

        String reve= list.stream().map(String::stripLeading)
        .collect(Collectors.collectingAndThen(Collectors.toList(),n->{
            Collections.reverse(n);
            return String.join(" ", n);
        }));


        System.out.println(reve);

        String reve1= list.stream().map(String::stripLeading)
        .collect(Collectors.joining(" "));
        System.out.println(reve1);
    }
}
