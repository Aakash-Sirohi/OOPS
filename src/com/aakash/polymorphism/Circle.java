package com.aakash.polymorphism;

public class Circle extends Shapes{
    @Override

    //this will run when object of Circle is created
    //hence it is overriding the parent method
    void area(){
        System.out.println("Area = pie*r*r");
    }
}


