package com.practic.code_period;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindOccurrenceString {
    public static void main(String[] args) {
        String str="i am learning stream api in java java";
        Map<String,Integer> map=new HashMap<>();
        String[] arr=str.split(" ");
        for(String value:arr){
            if(map.containsKey(value)){
                map.put(value,map.get(value)+1);
            }
            else{
                map.put(value,1);
            }
        }
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        List<Map.Entry<String,Integer>> list=new ArrayList<>(map.entrySet());
       System.out.println(list);
       map.entrySet().forEach(m-> System.out.println(m.getKey()+" "+m.getValue()));
        map.forEach((key,value)-> System.out.println(key+":"+value));


        //Using java8 calculate frequency of a string
        Map<String,Long> countmap=Arrays.stream(str.split(" ")).collect(Collectors
                .groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(countmap);

        //Find the word where only vowel letter is 2

        Arrays.stream(str.split(" ")).filter(x->x.replaceAll("[^aeiouAEIOU]","").length()==2)
                .forEach(System.out::println);


    }
}
