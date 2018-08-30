package com.dagong;

public class CanShuTest {
    public static void addOne(int a){
        a++;
        //return a;
    }
    public static void main(String[] args) {
        int a = 1;
        CanShuTest.addOne(a);
        System.out.println(a);
    }
}
