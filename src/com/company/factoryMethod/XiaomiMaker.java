package com.company.factoryMethod;

public class XiaomiMaker implements PhoneMaker {
    @Override
    public ISmartPhone makeSmartPhone() {
        return new XiaomiPhone();
    }
}
