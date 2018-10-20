package com.company.bridge;

public abstract class CarBridge {
IMake make;

    public CarBridge(IMake make) {
        this.make = make;
    }
   public  void showDetail(){
        differ();
        make.setMake();
   }

    protected abstract void differ();

}
