package com.zjc.pattern.adapterpattern.factorypattern;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Circle :: draw()");
    }
}
