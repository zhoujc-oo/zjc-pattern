package com.zjc.pattern.adapterpattern.factorypattern;

public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Rectangle :: draw()");
    }
}
