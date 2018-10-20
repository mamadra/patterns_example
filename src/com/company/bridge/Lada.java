package com.company.bridge;

public class Lada implements IMake {
    @Override
    public void setMake() {
        System.out.println("LADA");
    }
}
