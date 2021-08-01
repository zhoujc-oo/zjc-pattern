package com.zjc.pattern.commandpattern.observerpattern;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}