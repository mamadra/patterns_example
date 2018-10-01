package com.company.builder;

public class ApplePhoneBuilder extends SmartPhoneBuilder {
    @Override
    void buildName() {
        smartPhone.setName("IPhone");
    }

    @Override
    void buildOS() {
        smartPhone.setOperSystem(OS.IOS);
    }

    @Override
    void buildROM() {
        smartPhone.setROM(8);
    }
}
