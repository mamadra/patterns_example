package com.company.visitor;


public class BedNumber implements IElement {
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
