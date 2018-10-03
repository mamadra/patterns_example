package com.company.decorator;

public class ModelCar implements IModelInDB {
    String name;

    public ModelCar(String name) {
        this.name = name;
    }

    @Override
    public void printModel() {
        System.out.print(name);
    }
}
