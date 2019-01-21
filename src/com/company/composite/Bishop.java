package com.company.composite;

public class Bishop implements IChessman {

    private String fraction;

    public Bishop(String fraction) {
        this.fraction = fraction;
    }

    @Override
    public void action() {
        System.out.println(fraction + " Bishop action");
    }
}
