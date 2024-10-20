package com.practic.stream;

import java.util.Arrays;
import java.util.List;

public class SortedListOfElement {
    public static void main(String[] args) {
        List<String> sort= Arrays.asList("Banana", "Apple", "Orange", "Mango");
        List<String> afterSort=sort.stream().sorted(String::compareTo).toList();
        List<String> reverse=sort.stream().sorted((a,b)->b.compareTo(a)).toList();
        System.out.println("After sorted::"+afterSort);
        System.out.println("After reverse::"+reverse);
    }
}
