package com.company.abstractFactory.samsung;

import com.company.abstractFactory.interfaces.ISmart;

public class Samsung implements ISmart {
    @Override
    public String getName() {
        return "SAMSUNG phone";
    }

    @Override
    public void sendSms(String message, String number) {
        System.out.printf("отправка сообщения %s на номер %s %n",message,number);
    }
}
