package com.company.bridge;

public class Sedan extends CarBridge {
    public Sedan(IMake make) {
        super(make);
    }

    @Override
    protected void differ() {
        System.out.println("sedan");
    }
}
