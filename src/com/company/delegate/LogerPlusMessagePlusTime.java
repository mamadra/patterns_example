package com.company.delegate;

public class LogerPlusMessagePlusTime implements ILoger {

    long time;
    String name;

    public LogerPlusMessagePlusTime(long time, String name) {
        this.time = time;
        this.name = name;
    }

    @Override
    public void loger(String message) {
        System.out.printf("%s : %s : %tc%n", name, message, time);
    }
}
