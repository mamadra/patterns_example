package com.company.facade;

public class Products {

    private boolean producktReady=false;

    public boolean isProducktReady() {
        return producktReady;
    }

    public void preparationProduckt(boolean a){
        producktReady=a;
    }
}
