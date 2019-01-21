package com.company.singleton;

public class Run implements Runnable {
    @Override
    public void run() {
        Singleton.getInstance();
    }
}
