package com.aakash.access;

public class ObjectDemo {

    int num;
    ObjectDemo(){
        this.num = num;
    }
    @Override
    public int hashCode(){
        return super.hashCode();
    }
    @Override
    public boolean equals(Object obj){
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    public String toString(){
        return super.toString();
    }

//    @Override
//    public int finalise(){
//        return super.hashCode();
//    }


}
