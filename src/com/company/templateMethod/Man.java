package com.company.templateMethod;

public abstract class Man {
    public final void templateMetod() {
        System.out.print(" Привет, ");
        differ();
        System.out.print("А тебя? ");
        differ2();
    }

    abstract void differ();

    abstract void differ2();
}
