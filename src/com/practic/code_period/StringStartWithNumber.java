package com.practic.code_period;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringStartWithNumber {
    public static void main(String[] args) {
        int[] arr={50,20,55,30,58,40,59,10,51,60};
        //start with 5
      /*  Arrays.stream(arr).filter(m->String.valueOf(m).startsWith("5"))
                .forEach(System.out::println);*/

        //String reverse
        String str="Hyderabad";
        String rev = Arrays.stream(str.split("")).map(m -> new StringBuilder(m).reverse().toString())
                .collect(Collectors.joining());
       // System.out.println(new StringBuilder(rev).reverse().toString());
        System.out.println(new StringBuilder(str).reverse().toString());


    }
}
