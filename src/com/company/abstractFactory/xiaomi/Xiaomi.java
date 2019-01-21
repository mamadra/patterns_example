package com.company.abstractFactory.xiaomi;

import com.company.abstractFactory.interfaces.ISmart;

public class Xiaomi implements ISmart {
    @Override
    public String getName() {
        return "XIAOMI Phone";
    }

    @Override
    public void sendSms(String message, String number) {
        System.out.printf("отправка сообщения %s на номер %s %n", message, number);
    }
}
