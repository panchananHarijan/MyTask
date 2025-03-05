package com.practic.code_period;

import java.util.Arrays;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        //max number and index
        int[] arr={5,6,11,7,9,10};
        int max=arr[0];
        int maxIndex=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                maxIndex=i;
            }
        }
       // System.out.println(max);
        //System.out.println(maxIndex);

        //missing number
        int[] arr1={5,6,7,9,10,11};
        int start=arr1[0];
        int end=arr1[arr1.length-1];
        int exceptedSum=(end*(end+1))/2-((start-1)*start)/2;

        int actualVlaue=0;
        for(int value:arr1){
            actualVlaue+=value;
        }
        int result=exceptedSum-actualVlaue;
        System.out.println(result);



    }
}
