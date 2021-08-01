package com.zjc.pattern.factory.abstractfactorymode;


import com.zjc.pattern.factory.Shape;

abstract class AbstractFactory{
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
