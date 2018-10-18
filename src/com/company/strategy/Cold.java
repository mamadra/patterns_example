package com.company.strategy;

public class Cold implements IAction {
    @Override
    public void doSomething() {
            System.out.println("чайник холодный. греем");
     }
}
