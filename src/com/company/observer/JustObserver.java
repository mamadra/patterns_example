package com.company.observer;

public class JustObserver  implements Observer{
    @Override
    public void handleEvent(int temp, int presser) {
        System.out.println("температура ="+temp+"  давление ="+presser);
    }
}
