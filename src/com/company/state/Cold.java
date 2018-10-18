package com.company.state;

import javax.swing.*;

public class Cold implements IAction {
    @Override
    public void doSomething(Teapot teapot) {
        if (teapot.isOn()){
            System.out.println("чайник холодный. греем");
            teapot.setState(new Bask());
        } else System.out.println("чайник холодный. не греем");
     }
}
