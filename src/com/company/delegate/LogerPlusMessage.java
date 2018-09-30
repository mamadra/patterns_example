package com.company.delegate;

public class LogerPlusMessage implements ILoger{
    String message;

    public LogerPlusMessage(String message) {
        this.message = message;
    }

    @Override
    public void loger(String name) {
        System.out.printf("%s : %s%n",name,message);
    }
}
