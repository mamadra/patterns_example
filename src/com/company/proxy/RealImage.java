package com.company.proxy;

public class RealImage implements IImage {
    String file;

    public RealImage(String file) {
        this.file = file;
        load();
    }

    private void load() {
        System.out.println("LOAD ..... " + file);
    }

    @Override
    public void display() {
        System.out.println("DISPLAY " + file);
    }
}
