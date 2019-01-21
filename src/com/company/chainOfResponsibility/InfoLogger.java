package com.company.chainOfResponsibility;

public class InfoLogger extends Logger {
    public InfoLogger(int priority) {
        super(priority);
    }

    @Override
    void write(String message) {
        System.out.println("INFO : " + message);
    }
}
