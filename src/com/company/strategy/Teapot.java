package com.company.strategy;

public class Teapot {
    private IAction state;

    public void setState(IAction state) {
        this.state = state;
    }

    public void doSomething() {
        state.doSomething();
    }
}
