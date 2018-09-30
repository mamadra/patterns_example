package com.company;

import com.company.abstractFactory.factories.AppleDevice;
import com.company.abstractFactory.factories.DeviceFactory;
import com.company.abstractFactory.factories.SamsungDevice;
import com.company.abstractFactory.factories.XiaomiDevice;
import com.company.abstractFactory.interfaces.IHeadphones;
import com.company.abstractFactory.interfaces.INoteBook;
import com.company.abstractFactory.interfaces.ISmart;
import com.company.delegate.Loger;
import com.company.delegate.LogerPlusMessage;
import com.company.delegate.LogerPlusMessagePlusTime;
import com.company.facade.Logistick;
import com.company.factoryMethod.ISmartPhone;
import com.company.factoryMethod.PhoneMaker;
import com.company.factoryMethod.SamsungMaker;
import com.company.factoryMethod.XiaomiMaker;

public class Main {

    public static void main(String[] args) {

        Loger loger=new Loger();
        loger.setLoger(new LogerPlusMessage("Delegate"));
        loger.loger("one log log plus message");

        loger.setLoger(new LogerPlusMessagePlusTime(System.nanoTime(),"Delegate"));
        loger.loger("two log log plus message plus time");

        Logistick logistick=new Logistick();
        logistick.sendProduckt();

        PhoneMaker maker=new SamsungMaker();
        ISmartPhone smartPhone=maker.makeSmartPhone();

        loger.setLoger(new LogerPlusMessage("FactoryMethod"));
        loger.loger("smartphone="+smartPhone.getPhoneName());

        maker=new XiaomiMaker();
        smartPhone=maker.makeSmartPhone();

        loger.setLoger(new LogerPlusMessage("FactoryMethod"));
        loger.loger("smartphone="+smartPhone.getPhoneName());

        loger.setLoger(new LogerPlusMessage("AbstracktFactory"));


        DeviceFactory factory=getFactory("HP");

        ISmart phone=factory.getSmartPhone();
        INoteBook noteBook=factory.getNoteBook();
        IHeadphones headphones=factory.getHeadphone();

        loger.loger(phone.getName());
        phone.sendSms("hello","+71231231212");

        loger.loger(noteBook.getName());
        noteBook.openWebPage("google.com","chromium");

        headphones.playMusic();
    }

    public static DeviceFactory getFactory(String a) {
        switch (a){
            case "Samsung":{
                return new SamsungDevice();
            }
            case "Apple":{
                return new AppleDevice();
            }
            case "Xiaomi":{
                return new XiaomiDevice();
            }
            default: throw new RuntimeException("Нет такой фирмы:"+a);
        }
    }
}
