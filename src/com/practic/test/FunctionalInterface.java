package com.practic.test;

public class FunctionalInterface {
    public static void main(String[] args) {
        Runnable rm=()-> System.out.println("Run method call");
        rm.run();
    }
}
