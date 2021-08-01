package com.zjc.pattern.businessdelegatepattern.interceptingfilteroattern;

public class DebugFilter implements Filter {
    public void execute(String request){
        System.out.println("request log: " + request);
    }
}
