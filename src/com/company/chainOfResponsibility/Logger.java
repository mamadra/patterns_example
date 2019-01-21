package com.company.chainOfResponsibility;

public abstract class Logger {
    int priority;
    Logger next;

    public Logger(int priority) {
        this.priority = priority;
    }

    public void setNext(Logger next) {
        this.next = next;
    }

    public void writeMassage(String message, int level) {
        if (level <= priority) {
            write(message);
        }
        if (next != null) {
            next.writeMassage(message, level);
        }
    }

    abstract void write(String message);
}
