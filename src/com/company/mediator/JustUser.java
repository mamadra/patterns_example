package com.company.mediator;

public class JustUser extends User {

    public JustUser(Chat chat, String name) {
        super(chat, name);
    }

    public void getMessage(String message) {
        System.out.println("Юзер  " + getName() + " получает сообщение :" + message);
    }
}
