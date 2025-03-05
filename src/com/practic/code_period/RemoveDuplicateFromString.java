package com.practic.code_period;

import java.util.Arrays;

public class RemoveDuplicateFromString {
    public static void main(String[] args) {
        String str="dabcadefg";
       // str.chars().distinct().mapToObj(x->(char)x).forEach(System.out::print);
        //another approach
        Arrays.stream(str.split("")).distinct().forEach(System.out::print);



    }
}
