package com.company.delegate;

public class LogerPlusMessagePlusTime implements ILoger {

    long time;
    String message;

    public LogerPlusMessagePlusTime(long time, String message) {
        this.time = time;
        this.message = message;
    }

    @Override
    public void loger(String name) {
        System.out.printf("%s : %s : %tc%n",name,message,time);
    }
}
