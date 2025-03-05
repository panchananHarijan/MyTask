package com.practic.code_period;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String str="hhyderabad";
       // List<String> list = Arrays.stream(str.split("")).collect(Collectors.toList());

       /* Map<String, Long> map = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
*/
        /*Map<Character, Long> map = str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Character c = map.entrySet().stream().filter(m -> m.getValue() == 1)
                .map(m -> m.getKey()).findFirst().get();

        System.out.println(c);
*/
        //first non repeated character
        Character c = str.chars().mapToObj(x -> (char) x).collect(Collectors
                        .groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(m -> m.getValue() == 1)
                .map(Map.Entry::getKey).findFirst().get();

        //System.out.println("First non repeated character::"+c);


      findNonRepeatedChaarcter(str);




    }

    public static void findNonRepeatedChaarcter(String str){
        char[] arr = str.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        for(Character word:arr){
            if(map.containsKey(word)){
                map.put(word,map.get(word)+1);
            }
            else {
                map.put(word,1);
            }
        }
        int count=0;
        for(char word:arr){
            if(map.get(word)==1){
                count++;
                //System.out.println("First non repeated character::"+word);
                //return;
                if(count==2){
                    System.out.println("second non repeated character::"+word);
                }
            }
        }


    }
}
