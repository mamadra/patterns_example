package com.company.builder;

public class SmartPhone implements ISmartPhone {
    String name;
    OS operationSystem;
    int gbROM;

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public void setOperSystem(OS os) {
        this.operationSystem=os;
    }

    @Override
    public void setROM(int gbROM) {
        this.gbROM=gbROM;
    }

    @Override
    public String toString() {
        return String.format("SmartPhone name = %s ; %n" +
                "Operation System = %s ; %n" +
                "ROM = %d ; %n",name,operationSystem,gbROM);
    }
}
