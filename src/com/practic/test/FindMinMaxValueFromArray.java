package com.practic.test;

import java.util.Arrays;
import java.util.List;

public class FindMinMaxValueFromArray {
    public static void main(String[] args) {
        List<Integer> number=Arrays.asList(5, 3, 8, 1, 9, 2,29);

        //find max
        Integer max=number.stream().max(Integer::compareTo).orElse(null);

        //find min
        Integer min=number.stream().min(Integer::compareTo).orElse(null);

        System.out.println("Find min:"+min);
        System.out.println("FInd max:"+max);
    }
}
