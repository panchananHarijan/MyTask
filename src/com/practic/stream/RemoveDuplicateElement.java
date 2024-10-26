package com.practic.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateElement {
    public static void main(String[] args) {
        List<Integer> lst= Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> duplicatRemove=lst.stream().distinct().toList();
        System.out.println("Duplicate Remove after::"+duplicatRemove);
    }

}
