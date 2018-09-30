package com.company.abstractFactory.apple;

import com.company.abstractFactory.interfaces.ISmart;

public class Apple implements ISmart {
    @Override
    public String getName() {
        return "APPLE phone";
    }

    @Override
    public void sendSms(String message, String number) {
        System.out.printf("отправка сообщения %s на номер %s %n",message,number);
    }
}
