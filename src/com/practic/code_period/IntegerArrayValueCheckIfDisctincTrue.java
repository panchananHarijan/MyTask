package com.practic.code_period;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntegerArrayValueCheckIfDisctincTrue {
    public static void main(String[] args) {
        int[] arr={5,4,1,0,8,2,1};
        boolean value = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                .values().stream().noneMatch(x -> x > 1);


       // System.out.println(value);


        String [] str={"ewe","jji","jhj","kwk","aha"};
        Map<String, List<String>> mapList = Stream.of(str).collect(Collectors
                .groupingBy(x -> x.toString().substring(1, 2)));

       // System.out.println(mapList);

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        int sum = list.stream().mapToInt(Integer::intValue).sum();
       // System.out.println(sum);

        int reduce = list.stream().reduce(0, (a, b) -> a + b);
       // System.out.println(reduce);


        //sorted list of item based on the alphabet
        List<String> list1 = Arrays.asList("Zudio", "Puma", "Addidas", "MAC", "H&M");
        List<String> list2 = list1.stream().sorted().toList();
       // System.out.println(list2);


        //convert list of integer to there square
       List<Integer> num= Arrays.asList(1,2,3,4,5);
        List<Integer> multi = num.stream().map(x -> x * x).collect(Collectors.toList());
       // System.out.println(multi);


        //find distinct odd number
        List<Integer> oddnumber=Arrays.asList(1,2,3,4,5,6,8,9,9,10);
        List<Integer> oddDistinct=oddnumber.stream().filter(x->x%2!=0).distinct().toList();

       // System.out.println(oddDistinct);

        //nth smallest element
       List<Integer> nthSmallet= Arrays.asList(7,1,6,2,1,3,4,5);
       int k=3;
        int ans = nthSmallet.stream().sorted().skip(k - 1).findFirst().get();
       // System.out.println(ans);


        //remove character from int string
        List<String> remo=Arrays.asList("a1b2c3","1a2b3c","123abc");
        Pattern pattern=Pattern.compile("[^0-9]");
        List<String> list3 = remo.stream().map(x -> pattern.matcher(x)
                .replaceAll("")).toList();
        System.out.println(list3);


    }
}
