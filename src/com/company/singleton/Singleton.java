package com.company.singleton;

public class Singleton {
    public static int count = 0;
    private static volatile Singleton instance = null;

    private Singleton() {
        count++;
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
