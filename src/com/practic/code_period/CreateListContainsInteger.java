package com.practic.code_period;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class CreateListContainsInteger {
    public static void main(String[] args) {
        String[] str={"abc","123","456","xyz"};
        List<Integer> Ans = Arrays.stream(str).filter(x -> x.matches("[0-9]+"))
                .map(Integer::valueOf)
                .collect(Collectors.toList());

        //System.out.println(Ans);

        int[] arr={6,5,6,9,2,4};
        int ans = Arrays.stream(arr).boxed().collect(Collectors.toList()).stream().limit(2)
                .reduce(1, (a, b) -> a * b);

       // System.out.println(ans);

        //another approach
        List<Integer> list=Arrays.stream(arr).boxed().collect(Collectors.toList());
        int  result = list.stream().limit(2).reduce(1, (a, b) -> a * b);
       // System.out.println(result);


        //Angram check String

        String[] name={"pat","tap","pan","nap","Team","Meat"};
        List<String> convertList = Arrays.asList(name);
        Collection<List<String>> resultValue = convertList.stream().collect(Collectors
                .groupingBy(x -> Arrays.stream(x.toLowerCase().split(""))
                        .sorted().collect(Collectors.toList()))).values();


        System.out.println(resultValue);


    }
}
