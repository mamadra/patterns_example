package com.company.visitor;

public class PaymentHostel implements IElement {
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
