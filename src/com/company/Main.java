package com.company;

import com.company.abstractFactory.factories.AppleDevice;
import com.company.abstractFactory.factories.DeviceFactory;
import com.company.abstractFactory.factories.SamsungDevice;
import com.company.abstractFactory.factories.XiaomiDevice;
import com.company.abstractFactory.interfaces.IHeadphones;
import com.company.abstractFactory.interfaces.INoteBook;
import com.company.abstractFactory.interfaces.ISmart;
import com.company.bridge.*;
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
import com.company.flyweigh.IShape;
import com.company.flyweigh.ShapeFactory;
import com.company.interpreter.Context;
import com.company.interpreter.Expression;
import com.company.iterator.ConcretAggregator;
import com.company.iterator.IIterator;
import com.company.mediator.Admin;
import com.company.mediator.JustUser;
import com.company.mediator.TextChat;
import com.company.mediator.User;
import com.company.memento.File;
import com.company.memento.Game;
import com.company.memento.Save;
import com.company.observer.JustObserver;
import com.company.observer.MeteoStation;
import com.company.observer.Observed;
import com.company.prototype.Car;
import com.company.prototype.CarFactory;
import com.company.proxy.IImage;
import com.company.proxy.ProxyImage;
import com.company.proxy.RealImage;
import com.company.singleton.Run;
import com.company.singleton.Singleton;
import com.company.state.Cold;
import com.company.state.Teapot;
import com.company.strategy.Bask;
import com.company.strategy.Boiling;
import com.company.strategy.Burned;
import com.company.templateMethod.Man;
import com.company.templateMethod.Petya;
import com.company.templateMethod.Vasia;
import com.company.visitor.*;
import sun.rmi.runtime.Log;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        delegateExample();
        facadeExample();
        abstracktFactoryExample();
        builderExample();
        prototypeExample();
        compositeExample();
        decoratorExample();
        commandExample();
        chainOfResponsibilityExample();
        mementoExample();
        mediatorExample();
        observerExample();
        stateExample();
        templateExample();
        strategyExample();
        visitorExample();
        iteratorExample();
        proxyExample();
        flyweighExample();
        singletonExample();
        bridgeExample();
        interpreterExample();
    }

    private static void prototypeExample() {
        Car carOrig=new Car("kia RIO",200,6);
        Car carCopy=(Car) carOrig.copy();
        System.out.println(String.format("\t Orig %s%n\t Copy %s",carOrig.toString(),carCopy.toString()));

        CarFactory carFactory=new CarFactory(new Car("Ford",220,6));
        Car carCopyNew=carFactory.makeCopy();
        System.out.println(String.format("CopyNew %s",carCopyNew.toString()));

    }

    private static void builderExample() {
        Director director =new Director();
        director.setBuilder(new ApplePhoneBuilder());
        SmartPhone smartPhoneFB=director.buildeSmartPhone();
        System.out.println(smartPhoneFB.toString());
    }

    private static void abstracktFactoryExample() {
        DeviceFactory factory=getFactory("Samsung");
        ISmart phone=factory.getSmartPhone();
        INoteBook noteBook=factory.getNoteBook();
        IHeadphones headphones=factory.getHeadphone();
        System.out.println(phone.getName());
        phone.sendSms("hello","+71231231212");
        System.out.println(noteBook.getName());
        noteBook.openWebPage("google.com","chromium");
        headphones.playMusic();
    }

    private static void facadeExample() {
        Logistick logistick=new Logistick();
        logistick.sendProduckt();
        PhoneMaker maker=new SamsungMaker();
        ISmartPhone smartPhone=maker.makeSmartPhone();

        System.out.println("smartphone="+smartPhone.getPhoneName());
        maker=new XiaomiMaker();
        smartPhone=maker.makeSmartPhone();
        System.out.println("smartphone="+smartPhone.getPhoneName());
    }

    private static void delegateExample() {
        Loger loger=new Loger();
        loger.setLoger(new LogerPlusMessage("Delegate",":"));
        loger.loger("one log log plus message");

        loger.setLoger(new LogerPlusMessagePlusTime(System.nanoTime(),"Delegate"));
        loger.loger("two log log plus message plus time");
    }

    private static void interpreterExample() {
        Context context=new Context();
        Expression expression=context.evaluate("110+4+10+20+80+60-32-43-6-5-2-3-3-4-23522+34");
        System.out.println(expression.interpret());
    }

    private static void bridgeExample() {
        CarBridge car=new Coupe(new Lada());
        car.showDetail();
    }

    private static void singletonExample() {

        final int SIZE=5000;
        Thread t[]=new Thread[SIZE];

        for (int i=0;i<SIZE;i++){
            t[i]=new Thread(new Run());
            t[i].start();
        }
        for (int i=0;i<SIZE;i++){
            try {
                t[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Singleton.count);
    }

    private static void flyweighExample() {

        ShapeFactory shapeFactory=new ShapeFactory();
        List<IShape> shapes=new ArrayList<>();

        shapes.add(shapeFactory.getShape("круг"));
        shapes.add(shapeFactory.getShape("квадрат"));
        shapes.add(shapeFactory.getShape("круг"));
        shapes.add(shapeFactory.getShape("круг"));
        shapes.add(shapeFactory.getShape("точка"));
        shapes.add(shapeFactory.getShape("квадрат"));
        shapes.add(shapeFactory.getShape("точка"));

        Random random=new Random();
        for (IShape shape:shapes){
            int x=random.nextInt(100);
            int y=random.nextInt(100);
            shape.draw(x,y);
        }
    }

    private static void proxyExample() {
        IImage image=new ProxyImage("~/Picture/123.jpg");
        image.display();
    }

    private static void iteratorExample() {
        ConcretAggregator c=new ConcretAggregator();
        IIterator it=c.getIterator();

        while (it.hasNext()){
            System.out.println(it.getNext());
        }
    }

    private static void visitorExample() {
        IElement number=new NumberHostel();
        IElement bed=new BedNumber();
        IElement payment=new PaymentHostel();
        IVisitor guest=new Guest();
        IVisitor service=new Service();

        number.accept(guest);
        bed.accept(guest);
        payment.accept(guest);

        number.accept(service);
        bed.accept(service);
        payment.accept(service);

    }

    private static void strategyExample() {
        com.company.strategy.Teapot teapot=new com.company.strategy.Teapot();

        teapot.setState(new com.company.strategy.Cold());
        teapot.doSomething();

        teapot.setState(new Bask());
        teapot.doSomething();

        teapot.setState(new Boiling());
        teapot.doSomething();

        teapot.setState(new Burned());
        teapot.doSomething();
    }

    private static void templateExample() {
        Man vasya=new Vasia();
        Man petya=new Petya();
        vasya.templateMetod();
        petya.templateMetod();
        System.out.println();
    }

    private static void stateExample() {
        Teapot teapot =new Teapot();
        teapot.setState(new Cold());
        teapot.setOn(true);
        for(int i=0;i<5;i++){
           if (i==2) teapot.setOn(false);
            teapot.doSomething();
        }
    }

    private static void observerExample() {

        MeteoStation meteoStation=new MeteoStation();
        meteoStation.addObserver(new JustObserver());
        meteoStation.addObserver(new JustObserver());
        meteoStation.setParams(5,745);
        meteoStation.setParams(15,787);

    }

    private static void mediatorExample() {

        TextChat chat=new TextChat();
        User admin=new Admin(chat,"Ted");
        User u1=new JustUser(chat,"Tod");
        User u2=new JustUser(chat,"Tom");
        User u3=new JustUser(chat,"Bob");

        u1.setEnable(false);

        chat.setAdmin(admin);
        chat.addUser(u1);
        chat.addUser(u2);
        chat.addUser(u3);

        u2.sendMessage("Hola");
        admin.sendMessage("Hola");

    }

    private static void mementoExample() {

        Game game=new Game();
        game.set(300,30000);
        System.out.println(game.toString());
        game.set(1200,120000);
        System.out.println(game.toString());
        File file =new File();
        file.setSave(new Save(game.getPoint(),game.getTime()));
        game=null;
        try{
            System.out.println(game.toString());
        }catch (NullPointerException e){
            System.out.println("Игра оконченна  game=" +e);
        }
        game=new Game();
        game.load(file.getSave());
        System.out.println(game.toString());

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
