package com.practic.test;

import java.util.Arrays;
import java.util.List;

public class UsingReduceSumOFArray {
    public static void main(String[] args) {
        List<Integer> num= Arrays.asList(1, 2, 3, 4, 5);
        int sum=num.stream().reduce(Integer::sum).get();
        System.out.println(sum);
    }

}
