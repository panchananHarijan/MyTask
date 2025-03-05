package com.practic.code_period;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class CalculateStringLength {
    public static void main(String[] args) {
        String str="i am learning stream api in java";
        //with out stream()
        String[] arr=str.split(" ");
        int maxLength=0;
        String maxLengthWord="";
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()>maxLength){
                maxLength=arr[i].length();
                maxLengthWord=arr[i];
            }
        }
       // System.out.println("Max length word::"+maxLengthWord);

        //using java8 Stream()
        String maxLengthWords = Arrays.stream(str.split(" "))
                .max(Comparator.comparing(String::length)).get();
      //  System.out.println(maxLengthWords);
        //min length word
        String minLengthWord = Arrays.stream(str.split(" "))
                .min(Comparator.comparing(String::length)).get();

       // System.out.println(minLengthWord);


        //second highest length string
        String  secondHighestLengthString = Arrays.stream(str.split(" ")).sorted(Comparator.comparing(String::length).reversed())
                .skip(1).findFirst().orElseThrow(()->new RuntimeException("second heighest is not there"));
        System.out.println(secondHighestLengthString);

        //another approach find lenth

        Integer findLength = Arrays.stream(str.split(" ")).map(x -> x.length()).sorted(Comparator
                .reverseOrder()).skip(1).findFirst().get();

        System.out.println(findLength);


    }
}
