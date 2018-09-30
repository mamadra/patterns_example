package com.company;

import com.company.delegate.Loger;
import com.company.delegate.LogerPlusMessage;
import com.company.delegate.LogerPlusMessagePlusTime;

public class Main {

    public static void main(String[] args) {

        Loger loger=new Loger();
        loger.setLoger(new LogerPlusMessage("one log log plus message"));
        loger.loger("KDV");

        loger.setLoger(new LogerPlusMessagePlusTime(System.nanoTime(),"two log log plus message plus time"));
        loger.loger("KDV");

    }
}
