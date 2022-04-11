package com.aakash.dsc;

public class Wrapper {
    public static void main(String[] args) {
        int a =10;
        int b =20;
        Integer num = new Integer(45);
        swap(a,b);
        System.out.println();
        final A aakash = new A("Aakash Sirohi");
        aakash.name = "other name";
      //  aakash = new A("new object");

        A obj = new A("random nme");
        System.out.println(obj);
//        for (int i = 0; i < 1000000000; i++) {
//            obj = new A("Random Name");
//            System.out.println(obj.name);
//        }
    }

    static void swap(int a, int b){

    }

    void greeting(){
        System.out.println("Hello world");
    }


}


class A {
    final int NUMBER=2;
    String name;

    public A(String name){
        System.out.println("Object is created");
        this.name=name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}