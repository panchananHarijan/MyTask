package com.practic.code_period;

public class FindMaxValue_index_missingNumber {
    public static void main(String[] args) {
        int[] arr={5,6,11,7,9,10};
        int max=arr[0];
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                index=i;
            }
        }
        //System.out.println("Max number:"+max);
       // System.out.println("Max index::"+index);
//1,2,3,4,

        //find missing number
        int[] arr1={5,6,7,8,9,11,12,13};
        int start=arr1[0];
        int end=arr1[arr1.length-1];
        int exceptedResult=(end*(end+1))/2-((start-1)*start)/2;
        int actualResult=0;
        for(int value:arr1){
            actualResult+=value;
        }
        int result=exceptedResult-actualResult;
        System.out.println(result);

    }
}
