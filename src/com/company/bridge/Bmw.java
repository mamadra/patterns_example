package com.company.bridge;

public class Bmw implements IMake {
    @Override
    public void setMake() {
        System.out.println("BMW");
    }
}
