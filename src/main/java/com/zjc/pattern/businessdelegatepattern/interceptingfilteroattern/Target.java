package com.zjc.pattern.businessdelegatepattern.interceptingfilteroattern;

public class Target {
    public void execute(String request){
        System.out.println("Executing request: " + request);
    }
}