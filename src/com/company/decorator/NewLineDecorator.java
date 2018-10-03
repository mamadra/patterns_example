package com.company.decorator;

public class NewLineDecorator extends Decorator {

    public NewLineDecorator(IModelInDB component) {
        super(component);
    }

    @Override
    public void printModel() {
        System.out.printf(String.format("%n"));
        component.printModel();
        System.out.printf(String.format("%n"));
    }
}
