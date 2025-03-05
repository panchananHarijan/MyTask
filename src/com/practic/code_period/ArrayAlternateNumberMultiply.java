package com.practic.code_period;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class ArrayAlternateNumberMultiply {
    public static void main(String[] args) {
        int[] arr={4,5,1,7,2,9,2};
        int result=1;
        for(int i=0;i<arr.length;i+=2){
            result*=arr[i];
        }
       // System.out.println(result);


        //using java8
        /*int reduce = Arrays.stream(arr).filter(i -> Arrays.asList(arr).indexOf(i)%2==0)
                .reduce(1,(a, b) -> a * b);

        System.out.println(reduce);*/

        int alterNumberMult = IntStream.range(0, arr.length)
                .filter(i -> i % 2 == 0)
                .map(i -> arr[i])
                .reduce(1, (a, b) -> a * b);

      //  System.out.println(alterNumberMult);

        //Total multiply the number which is in array
        int mult = IntStream.range(0, arr.length)
                .map(i -> arr[i])
                .reduce(1, (a, b) -> a * b);

       // System.out.println(mult);

        //sum of the total number
        int sumTotal = IntStream.range(0, arr.length)
                .map(i -> arr[i])
                .reduce(0, (a, b) -> a + b);

        System.out.println(sumTotal);

        //sum of alternative number
        int sumAlternatNumber = IntStream.range(0, arr.length)
                .filter(i -> i % 2 == 0)
                .map(i -> arr[i])
                .reduce(0, (a, b) -> a + b);

        System.out.println(sumAlternatNumber);


    }
}
