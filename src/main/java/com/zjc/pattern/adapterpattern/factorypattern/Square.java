package com.zjc.pattern.adapterpattern.factorypattern;

public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Square :: draw()");
    }
}
