package com.company.builder;

public class SamsungBuilder extends SmartPhoneBuilder {
    @Override
    void buildName() {
        smartPhone.setName("Samsung");
    }

    @Override
    void buildOS() {
        smartPhone.setOperSystem(OS.Android);
    }

    @Override
    void buildROM() {
        smartPhone.setROM(8);
    }
}
