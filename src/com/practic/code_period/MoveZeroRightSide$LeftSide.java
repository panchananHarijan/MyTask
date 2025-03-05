package com.practic.code_period;

import java.util.Arrays;

public class MoveZeroRightSide$LeftSide {
    public static void main(String[] args) {
        int[] arr={5,0,1,0,8,0};


        //move zero right side
        int nonZeroIndex=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[nonZeroIndex];
                arr[nonZeroIndex]=arr[i];
                arr[i]=temp;
                nonZeroIndex++;

            }
        }
       // System.out.println(Arrays.toString(arr));


        //move zero left side
        int nonZeroIndx=arr.length-1;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]!=0){
                int temp=arr[nonZeroIndx];
                arr[nonZeroIndx]=arr[i];
                arr[i]=temp;
                nonZeroIndx--;
            }
        }

        System.out.println(Arrays.toString(arr));


    }
}
