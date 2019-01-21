package com.company.composite;

public class Rook implements IChessman {

    private String fraction;

    public Rook(String fraction) {
        this.fraction = fraction;
    }

    @Override
    public void action() {
        System.out.println(fraction + " rook action");
    }
}
