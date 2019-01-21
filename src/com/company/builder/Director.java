package com.company.builder;

public class Director {
    SmartPhoneBuilder builder;


    public void setBuilder(SmartPhoneBuilder builder) {
        this.builder = builder;
    }

    public SmartPhone buildeSmartPhone() {
        builder.createSmartPhone();
        builder.buildName();
        builder.buildOS();
        builder.buildROM();
        SmartPhone smartPhone = builder.getSmartPhone();
        return smartPhone;
    }
}
