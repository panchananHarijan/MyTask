package com.practic.stream;

import java.util.Arrays;
import java.util.List;

public class FilterEvenFromList {
    public static void main(String[] args) {
        List<Integer> num= Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> number=num.stream().filter(nu->nu%2==0).toList();
        System.out.println("Even Number is="+number);
    }

}
