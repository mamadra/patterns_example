package com.company.facade;

import com.company.delegate.Loger;
import com.company.delegate.LogerPlusMessage;
import sun.rmi.runtime.Log;

public class Truck {

    Loger loger;

    public Truck(Loger loger) {
        this.loger = loger;
    }

    public void loadingTruck(Products products) {
        if (products.isProducktReady()) {
            loger.loger("Загружаем продукты");
        } else {
            loger.loger("Продукты не готовы. Ожидаем");
        }
    }
}
