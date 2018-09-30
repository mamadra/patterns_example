package com.company.abstractFactory.samsung;

import com.company.abstractFactory.interfaces.IHeadphones;

public class SamsungHeadphones implements IHeadphones {
    @Override
    public void playMusic() {
        System.out.println("Играем музыку через Samsung ");
    }
}
