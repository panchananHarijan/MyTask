package com.practic.code_period;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MainTest {
    public static void main(String[] args) {
        int[] arr={5,0,1,0,8,0};
        int nonZeroIndex=arr.length-1;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]!=0){
                int temp=arr[nonZeroIndex];
                arr[nonZeroIndex]=arr[i];
                arr[i]=temp;
                nonZeroIndex--;
            }
        }

       // System.out.println(Arrays.toString(arr));

        //Using java8
        //List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        int[] array = IntStream.concat(Arrays.stream(arr)
                .filter(x -> x != 0), Arrays.stream(arr).filter(x -> x == 0)).toArray();

       // System.out.println(Arrays.toString(array));


        int[] arra = IntStream.concat(Arrays.stream(arr)
                .filter(x -> x == 0), Arrays.stream(arr).filter(x -> x != 0)).toArray();

        System.out.println("Moving Left side zero::"+Arrays.toString(arra));



    }


}
