package com.company;

import com.company.abstractFactory.factories.AppleDevice;
import com.company.abstractFactory.factories.DeviceFactory;
import com.company.abstractFactory.factories.SamsungDevice;
import com.company.abstractFactory.factories.XiaomiDevice;
import com.company.abstractFactory.interfaces.IHeadphones;
import com.company.abstractFactory.interfaces.INoteBook;
import com.company.abstractFactory.interfaces.ISmart;
import com.company.builder.ApplePhoneBuilder;
import com.company.builder.Director;
import com.company.builder.SamsungBuilder;
import com.company.builder.SmartPhone;
import com.company.chainOfResponsibility.DebugLogger;
import com.company.chainOfResponsibility.ErrorLogger;
import com.company.chainOfResponsibility.InfoLogger;
import com.company.chainOfResponsibility.Logger;
import com.company.command.*;
import com.company.composite.*;
import com.company.decorator.CopyPrintModel;
import com.company.decorator.IModelInDB;
import com.company.decorator.ModelCar;
import com.company.decorator.NewLineDecorator;
import com.company.delegate.Loger;
import com.company.delegate.LogerPlusMessage;
import com.company.delegate.LogerPlusMessagePlusTime;
import com.company.facade.Logistick;
import com.company.factoryMethod.ISmartPhone;
import com.company.factoryMethod.PhoneMaker;
import com.company.factoryMethod.SamsungMaker;
import com.company.factoryMethod.XiaomiMaker;
import com.company.prototype.Car;
import com.company.prototype.CarFactory;
import sun.rmi.runtime.Log;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {

        Loger loger=new Loger();
        loger.setLoger(new LogerPlusMessage("Delegate",":"));
        loger.loger("one log log plus message");

        loger.setLoger(new LogerPlusMessagePlusTime(System.nanoTime(),"Delegate"));
        loger.loger("two log log plus message plus time");


        Logistick logistick=new Logistick();
        logistick.sendProduckt();
        PhoneMaker maker=new SamsungMaker();
        ISmartPhone smartPhone=maker.makeSmartPhone();

        loger.setLoger(new LogerPlusMessage("FactoryMethod ",":"));
        loger.loger("smartphone="+smartPhone.getPhoneName());
        maker=new XiaomiMaker();
        smartPhone=maker.makeSmartPhone();
        loger.loger("smartphone="+smartPhone.getPhoneName());

        loger.setLoger(new LogerPlusMessage("AbstracktFactory",":"));
        DeviceFactory factory=getFactory("Samsung");
        ISmart phone=factory.getSmartPhone();
        INoteBook noteBook=factory.getNoteBook();
        IHeadphones headphones=factory.getHeadphone();
        loger.loger(phone.getName());
        phone.sendSms("hello","+71231231212");
        loger.loger(noteBook.getName());
        noteBook.openWebPage("google.com","chromium");
        headphones.playMusic();

        loger.setLoger(new LogerPlusMessage(String.format("Builder %n"),""));
        Director director =new Director();
        director.setBuilder(new ApplePhoneBuilder());
        SmartPhone smartPhoneFB=director.buildeSmartPhone();
        loger.loger(smartPhoneFB.toString());

        loger.setLoger(new LogerPlusMessage(String.format("Protorype %n"),""));
        Car carOrig=new Car("kia RIO",200,6);
        Car carCopy=(Car) carOrig.copy();
        loger.loger(String.format("\t Orig %s%n\t Copy %s",carOrig.toString(),carCopy.toString()));

        CarFactory carFactory=new CarFactory(new Car("Ford",220,6));
        Car carCopyNew=carFactory.makeCopy();
        loger.loger(String.format("CopyNew %s",carCopyNew.toString()));


        compositeExample();

        decoratorExample();

        commandExample();

        chainOfResponsibilityExample();
    }

    private static void chainOfResponsibilityExample() {

        Logger loggerError=new ErrorLogger(1);
        Logger loggerDebug=new DebugLogger(2);
        Logger loggerInfo=new InfoLogger(3);

        loggerError.setNext(loggerDebug);
        loggerDebug.setNext(loggerInfo);

        loggerError.writeMassage("Инфо Логгер",3);
        loggerError.writeMassage("Дебаг Логгер",2);
        loggerError.writeMassage(" Критичная ситуация",3);

    }

    private static void commandExample() {
        Dog dog=new Dog();
        Human human=new Human(new StandCommand(dog),new SitCommand(dog),new LieCommand(dog));

        human.standCommand();
        human.sitCommand();
        human.lieCommand();
    }

    private static void decoratorExample() {
        IModelInDB modelCar=new CopyPrintModel(new NewLineDecorator(new ModelCar("ford")),5);
        modelCar.printModel();
    }

    private static void compositeExample() {

        Composite compositeMyChessman=new Composite();
        Composite compositeRivalChessman=new Composite();
        Composite compositeChessboard =new Composite();

        compositeMyChessman.addComponent(new Rook("my"));
        compositeMyChessman.addComponent(new Knight("my"));
        compositeMyChessman.addComponent(new Bishop("my"));
        compositeMyChessman.addComponent(new Rook("my"));

        compositeRivalChessman.addComponent(new Knight("rival"));
        compositeRivalChessman.addComponent(new Knight("rival"));
        compositeRivalChessman.addComponent(new Bishop("rival"));

        compositeChessboard.addComponent(compositeMyChessman);
        compositeChessboard.addComponent(compositeRivalChessman);

        compositeChessboard.action();
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
