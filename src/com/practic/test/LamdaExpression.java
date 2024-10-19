package com.practic.test;


//function interface
@FunctionalInterface
interface ArithmeticOperation{
    int operation(int a,int b);
}
public class LamdaExpression {
    public static void main(String[] args) {
        //Using lambda Expression different operation
        //Addition
        ArithmeticOperation add=(a,b)->a+b;

        //substraction
        ArithmeticOperation sub=(a,b)->a-b;

        //multiplay
        ArithmeticOperation mul=(a,b)->a*b;

        //divide
        ArithmeticOperation div=(a,b)->{
            if(b==0){
                throw new IllegalArgumentException("Division by Zero is not allowed");
            }
            return a/b;
        };

        //test the operation
        int x=10;
        int y=5;
        System.out.println("Addition:"+add.operation(x,y));
        System.out.println("Substract:"+sub.operation(x,y));
        System.out.println("Mul:"+mul.operation(x,y));
        System.out.println("Div:"+div.operation(x,y));


    }
}
