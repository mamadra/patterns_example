package com.company.state;

public class Burned implements IAction {
    @Override
    public void doSomething(Teapot teapot) {
        if (teapot.isOn()) {
            System.out.println("чайник сгорел . греем");
            teapot.setState(new Bask());
        } else System.out.println("чайник сгорел. не греем");

    }
}
