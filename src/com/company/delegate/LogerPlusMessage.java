package com.company.delegate;

public class LogerPlusMessage implements ILoger{
    String name;

    public LogerPlusMessage(String name) {
        this.name = name;
    }

    @Override
    public void loger(String message) {
        System.out.printf("%s : %s%n",name,message);
    }
}
