package com.company.state;

public class Teapot {
    private IAction state;
    private boolean on;

    public void setState(IAction state) {
        this.state = state;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void doSomething() {
        state.doSomething(this);
    }
}
