package com.company.abstractFactory.xiaomi;

import com.company.abstractFactory.interfaces.IHeadphones;

public class XiaomiHeadphones implements IHeadphones {
    @Override
    public void playMusic() {
        System.out.println("Играем музыку через Xiaomi ");
    }
}
