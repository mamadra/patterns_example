package com.company.composite;

public class Knight implements IChessman {

    private String fraction;

    public Knight(String fraction) {
        this.fraction = fraction;
    }

    @Override
    public void action() {
        System.out.println(fraction + " Knight action");
    }
}
