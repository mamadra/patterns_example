package com.company.delegate;

public class LogerPlusMessage implements ILoger {
    String name;

    public LogerPlusMessage(String name, String delimetr) {
        this.name = name + delimetr;
    }

    @Override
    public void loger(String message) {
        System.out.printf("%s%s%n", name, message);
    }
}
