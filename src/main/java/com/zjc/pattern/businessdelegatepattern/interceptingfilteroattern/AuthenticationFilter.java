package com.zjc.pattern.businessdelegatepattern.interceptingfilteroattern;

public class AuthenticationFilter implements Filter {
    public void execute(String request){
        System.out.println("Authenticating request: " + request);
    }
}
