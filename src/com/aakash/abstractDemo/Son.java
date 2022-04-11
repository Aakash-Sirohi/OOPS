package com.aakash.abstractDemo;

public class Son extends Parent{

    @Override
    void career(String name){
        System.out.println("I am going to be a doctor" + name);
    }
    @Override
    void partner(String name, int age){
        System.out.println("I love Food"+ name +age);
    }
}
