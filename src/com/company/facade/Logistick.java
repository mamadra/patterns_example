package com.company.facade;

import com.company.delegate.Loger;
import com.company.delegate.LogerPlusMessage;

public class Logistick {

    Loger loger=new Loger();
    Products products=new Products();
    Truck truck=new Truck(loger);

    public Logistick() {
        loger.setLoger(new LogerPlusMessage("Facade"));
    }

    public void sendProduckt(){
        products.preparationProduckt(false);
        truck.loadingTruck(products);
    }

}
