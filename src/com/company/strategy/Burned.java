package com.company.strategy;

public class Burned implements IAction {
    @Override
    public void doSomething() {
        System.out.println("чайник сгорел . Не греем");
    }
}
