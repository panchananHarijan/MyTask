package com.practic.code_period;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OneIntegerArrayDevideTwoOddEven {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        Map<Boolean, List<Integer>> map = list.stream()
                .collect(Collectors.groupingBy(x -> x % 2 == 0, Collectors.toList()));

        System.out.println(map);

        //different approach
         List<List<Integer>> ma = list.stream()
                .collect(Collectors.groupingBy(x -> x % 2 == 0, Collectors.toList()))
                .entrySet().stream().map(x->x.getValue()).collect(Collectors.toList());

        System.out.println(ma);


        String str="Mississippi";
        Map<String, Long> count = Arrays.stream(str.split("")).collect(Collectors
                .groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(count);


    }
}
