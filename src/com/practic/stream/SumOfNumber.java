package com.practic.stream;

import java.util.Arrays;
import java.util.List;

public class SumOfNumber {
    public static void main(String[] args) {
        List<Integer> num= Arrays.asList(1, 2, 3, 4, 5);
       Integer result= num.stream().reduce(Integer::sum).get();

       Integer sum=num.stream().mapToInt(Integer::intValue).sum();
        System.out.println("After sum of array::"+sum);

        System.out.println("After adding the list:"+result);
    }
}
