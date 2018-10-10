package com.company.observer;

import java.util.ArrayList;
import java.util.List;

public class MeteoStation implements Observed {
    int temp;
    int press;
    List<Observer> observers=new ArrayList<>();


    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer o:observers){
            o.handleEvent(temp,press);
        }
    }

    public void setParams(int t,int p){
        temp=t;
        press=p;
        notifyObservers();
    }
}
