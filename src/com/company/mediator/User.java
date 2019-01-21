package com.company.mediator;

abstract public class User {
    private Chat chat;
    private String name;
    private boolean isEnable = true;

    public User(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    public boolean isEnable() {
        return isEnable;
    }

    public void setEnable(boolean enable) {
        isEnable = enable;
    }

    public String getName() {
        return name;
    }

    public void sendMessage(String message) {
        chat.sednMessage(message, this);
    }

    abstract void getMessage(String message);

    @Override
    public String toString() {
        return "User{" +
                "chat=" + chat +
                ", name='" + name + '\'' +
                ", isEnable=" + isEnable +
                '}';
    }
}
