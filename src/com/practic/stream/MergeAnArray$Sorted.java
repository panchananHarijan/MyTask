package com.practic.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeAnArray$Sorted {
    public static void main(String[] args) {
        int[] arr1={2, 4, 0, 7, 6};
        int[] arr2= {8, 3, 0};
        int[] concat = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
                .sorted()
                .toArray();

        System.out.println(Arrays.toString(concat));

    }
}
