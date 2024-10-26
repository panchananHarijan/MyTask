package com.practic.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedReverseOrder {
    public static void main(String[] args) {
        List<String> name= Arrays.asList("John", "Alice", "Bob", "Diana");
        List<String> sortedName=name.stream().sorted((a,b)->b.compareTo(a)).toList();
        System.out.println("Reverse name"+sortedName);
    }

}
