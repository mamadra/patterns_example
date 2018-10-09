package com.company.chainOfResponsibility;

public class ErrorLogger extends Logger {
    public ErrorLogger(int priority) {
        super(priority);
    }

    @Override
    void write(String message) {
        System.out.println("ERROR : "+message);
    }
}
