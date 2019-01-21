package com.company.decorator;

public class CopyPrintModel extends Decorator {
    int countCopy;

    public CopyPrintModel(IModelInDB component, int countCopy) {
        super(component);
        this.countCopy = countCopy;
    }

    @Override
    public void printModel() {
        for (int i = 0; i < countCopy; i++) {
            component.printModel();
        }
    }
}
