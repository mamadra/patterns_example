package com.company.state;

public class Boiling implements IAction {
    @Override
    public void doSomething(Teapot teapot) {
        if (teapot.isOn()){
            System.out.println("чайник кипит. греем дальше");
            teapot.setState(new Burned());
        } else {
            System.out.println("чайник кипел. остывает");
            teapot.setState(new Cold());
        }
    }
}
