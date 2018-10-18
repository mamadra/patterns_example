package com.company.strategy;

public class Boiling implements IAction {
    @Override
    public void doSomething() {
            System.out.println("чайник кипит. греем дальше");
    }
}
