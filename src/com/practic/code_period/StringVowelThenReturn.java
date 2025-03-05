package com.practic.code_period;

public class StringVowelThenReturn {
    public static void main(String[] args) {
        String str="i am learning stream api in java";
        String [] arr=str.split(" ");
        for(int i=0;i<arr.length;i++){
           String word=arr[i];
           int vowelCount=0;
           for(int j=0;j<word.length();j++){
               char ch=Character.toLowerCase(word.charAt(j));
               if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                   vowelCount++;
               }
           }
            if(vowelCount==2){
                System.out.println(word);
            }

        }
    }
}
