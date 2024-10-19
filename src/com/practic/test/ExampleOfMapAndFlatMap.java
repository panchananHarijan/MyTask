package com.practic.test;

import java.util.Arrays;
import java.util.List;

public class ExampleOfMapAndFlatMap {
    public static void main(String[] args) {
        //Using Map
        List<String> name= Arrays.asList("Alice", "Bob", "Charlie");
        List<String> result=name.stream().map(String::toUpperCase).toList();
        System.out.println("Using amp::"+result);
        //Using flatMap
        List<List<String>> lst=Arrays.asList(
                Arrays.asList("A", "B"),
                Arrays.asList("C", "D"),
                Arrays.asList("E")
        );

        List<String> newResult=lst.stream().flatMap(List::stream).toList();
        System.out.println("FlatMap result::"+newResult);

    }
}
