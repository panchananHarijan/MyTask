package com.practic.onlinetest;

public class Animal {
    /*public Animal() {
        System.out.println("Parent class constructor");
    }*/
    public void eat(){
        System.out.println("Animal eating anything");
    }
}
    class Tiger extends Animal{
        /*public Tiger(){
            System.out.println("Subclass constructor");
        }*/
        public void eat(){
            System.out.println("Tiger eating meat");
        }
    }



