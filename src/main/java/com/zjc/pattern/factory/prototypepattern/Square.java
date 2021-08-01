package com.zjc.pattern.factory.prototypepattern;

public class Square extends Shape{
    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square :: draw() method.");
    }
}
