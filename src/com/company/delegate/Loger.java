package com.company.delegate;

public class Loger  {
    ILoger loger;

    public void setLoger(ILoger loger) {
        this.loger = loger;
    }

    public void loger(String str){
        loger.loger(str);
    }
}
