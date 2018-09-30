package com.company.abstractFactory.apple;

import com.company.abstractFactory.interfaces.IHeadphones;

public class AppleHeadphones implements IHeadphones {
    @Override
    public void playMusic() {
        System.out.println("Играем музыку через Apple ");
    }
}
