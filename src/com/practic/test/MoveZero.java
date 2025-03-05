package com.practic.test;

import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args) {
        int[] arr={2,4,0,7,6,8,0,3,0};
        int indexZero=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[indexZero];
                arr[indexZero]=arr[i];
                arr[i]=temp;
                indexZero++;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
