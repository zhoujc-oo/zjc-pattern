package com.zjc.pattern.factory.abstractfactorymode;

public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue :: fill() method.");
    }
}
