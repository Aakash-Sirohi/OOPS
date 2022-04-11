package com.aakash.dsc;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] rno = new int[5];
        String[] names = new String[5];
        float [] marks = new float[5];
        Student[] students = new Student[5];

        Student aakash;
        System.out.println(Arrays.toString(students));

    }

    public class Student{
        int[] rno;
        String[] names;
        float marks;

    }
}
