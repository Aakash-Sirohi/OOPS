package com.aakash.inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight(){
        this.weight=-1;
    }

    public BoxWeight(double weight) {
        this.weight = weight;
    }

    public BoxWeight(BoxWeight other){
        super(other);
        weight=other.weight;

    }

    BoxWeight(double side, double weight){
        super(side);
        this.weight=weight;
    }


    public BoxWeight(double l, double w, double h, double weight) {
     //   super(l, w, h);
        this.weight = weight;
      //  System.out.println(super.weight);
    }
}
