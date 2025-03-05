package com.practic.code_period;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class IntegerGroupByRange {
    public static void main(String[] args) {
        int[] arr={2,3,10,14,20,24,30,34,40,44,50,54};
        List<Integer> num = Arrays.stream(arr).boxed().collect(Collectors.toList());

        Map<Integer, List<Integer>> mplListing = num.stream()
                .collect(Collectors.groupingBy(x -> x / 10 * 10, Collectors.toList()));

        System.out.println(mplListing);




    }
}
