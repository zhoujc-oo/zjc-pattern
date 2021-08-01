package com.zjc.pattern.commandpattern.visitorpattern;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
