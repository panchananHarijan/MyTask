package com.practic.code_period;

import java.util.stream.IntStream;

public class MultiplyArrayFirst_LastElement {
    public static void main(String[] args) {
        int[] arr={4,5,1,7,2,9};
        int n=arr.length;

        for(int i=0;i<n/2;i++){
        int result=arr[i]*arr[n-i-1];
        //System.out.println(result);


        //Using java8
            IntStream.range(0,arr.length/2)
                    .map(x->arr[x]*arr[arr.length-x-1])
                    .forEach(System.out::println);

        }

    }
}
