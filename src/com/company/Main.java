package com.company;

import com.company.delegate.Loger;
import com.company.delegate.LogerPlusMessage;
import com.company.delegate.LogerPlusMessagePlusTime;
import com.company.facade.Logistick;

public class Main {

    public static void main(String[] args) {

        Loger loger=new Loger();
        loger.setLoger(new LogerPlusMessage("Delegate"));
        loger.loger("one log log plus message");

        loger.setLoger(new LogerPlusMessagePlusTime(System.nanoTime(),"Delegate"));
        loger.loger("two log log plus message plus time");

        Logistick logistick=new Logistick();
        logistick.sendProduckt();

    }
}
