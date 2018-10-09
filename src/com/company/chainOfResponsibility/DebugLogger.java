package com.company.chainOfResponsibility;

public class DebugLogger extends Logger {
    public DebugLogger(int priority) {
        super(priority);
    }

    @Override
    void write(String message) {
        System.out.println("DEBUG : "+message);
    }
}
