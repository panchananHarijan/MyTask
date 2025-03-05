package com.practic.code_period;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SeperateEven$OddSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 7, 2, 9, 3, 8, 11, 19};
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        List<Integer> even = list.stream().filter(m -> m % 2 == 0).toList();
        List<Integer> odd = list.stream().filter(n -> n % 2 != 0).toList();

        List<Integer> concat = Stream.concat(even.stream(), odd.stream())
                .collect(Collectors.toList());

        System.out.println(concat);


    }
}
