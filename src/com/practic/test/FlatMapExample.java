package com.practic.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        List<List<String>> flatmap= Arrays.asList(
                Arrays.asList("A","B","C"),
                Arrays.asList("D","E","F"),
                Arrays.asList("G","H")

        );
        List<String> num=flatmap.stream().flatMap(List::stream).toList();
        System.out.println("Flat list::"+num);
    }
}
