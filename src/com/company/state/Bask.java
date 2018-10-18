package com.company.state;

public class Bask implements IAction {
    @Override
    public void doSomething(Teapot teapot) {
        if (teapot.isOn()){
            System.out.println("чайник теплый. греем дальше");
            teapot.setState(new Boiling());
        } else {
            System.out.println("чайник теплый. остывает");
            teapot.setState(new Cold());
        }

    }
}
