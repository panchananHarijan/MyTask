package com.practic.stream;

import java.util.Arrays;
import java.util.List;

public class UsingMap {
    public static void main(String[] args) {
        List<String> lst= Arrays.asList("Alice", "Bob", "Charlie", "David");
        List<String> lm=lst.stream().map(String::toUpperCase).toList();
        System.out.println("After Using map::"+lm);
    }
}
