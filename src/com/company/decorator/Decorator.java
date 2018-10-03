package com.company.decorator;

 public abstract class Decorator implements IModelInDB{

     IModelInDB component;

     public Decorator(IModelInDB component) {
         this.component = component;
     }
 }
