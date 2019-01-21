package com.company.builder;

abstract class SmartPhoneBuilder {
    SmartPhone smartPhone;

    void createSmartPhone() {
        smartPhone = new SmartPhone();
    }

    abstract void buildName();

    abstract void buildOS();

    abstract void buildROM();

    SmartPhone getSmartPhone() {
        return smartPhone;
    }
}
