package com.practic.test;

import java.util.Arrays;
import java.util.List;

public class LambdaExpressionNameSort {

    public static void main(String[] args) {
        List<String> names= Arrays.asList("John", "Alice", "Bob", "Diana");
        names.sort(String::compareTo);
        names.forEach(System.out::println);

    }
}
