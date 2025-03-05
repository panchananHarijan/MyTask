package com.practic.code_period;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ArrangeTheNumberASC$DSC {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
       // Arrays.stream(arr).mapToObj(x->x).sorted(Collections.reverseOrder()).forEach(System.out::print);
       // Arrays.stream(arr).mapToObj(y->y).sorted().forEach(System.out::print);

        //sum of unique element
        int[] arr1 = {1, 6, 7, 8, 1, 1, 8, 8, 7};
        int sum = Arrays.stream(arr1).distinct().sum();
       // System.out.println(sum);

        //different approach

        int sumval = 0;
        Set<Integer> set = new HashSet<>();
        for (int num : arr1) {
            set.add(num);
        }
        for (int val : set) {
            sumval += val;
        }
       // System.out.println(sumval);

        removeDupliacteSum(arr1);

    }
     //Unique sum of value
    public static void removeDupliacteSum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){

            boolean isDuplicate=false;
            for(int j=0;j<arr.length;j++){
                if(i !=j && arr[i]==arr[j]){
                    isDuplicate=true;
                    break;
                }
            }
            if(!isDuplicate){
                sum+=arr[i];
            }
        }
        System.out.println(sum);
    }
}
