package com.company.bridge;

public class Coupe extends CarBridge {
    public Coupe(IMake make) {
        super(make);
    }

    @Override
    protected void differ() {
        System.out.println("COUPE ");
    }
}
