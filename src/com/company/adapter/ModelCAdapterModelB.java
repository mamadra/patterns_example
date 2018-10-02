package com.company.adapter;

public class ModelCAdapterModelB extends ModelB implements IModelC {

    ModelB modelB=new ModelB();

    @Override
    public void xAction() {
        actionX();
//        OR
    modelB.actionX();
    }

    @Override
    public void yAction() {
        actionY();
//        OR
        modelB.actionY();
    }
}
