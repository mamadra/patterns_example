package com.company.factoryMethod;

public class SamsungMaker implements PhoneMaker {
    @Override
    public ISmartPhone makeSmartPhone() {
        return new SamsungPhone();
    }
}
