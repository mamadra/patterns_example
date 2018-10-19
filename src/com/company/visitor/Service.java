package com.company.visitor;

public class Service implements IVisitor {
    @Override
    public void visit(NumberHostel numberHostel) {
        System.out.println("Горничная убирает номер ");
    }

    @Override
    public void visit(BedNumber bedNumber) {
        System.out.println("Горничная убирает кровать");
    }

    @Override
    public void visit(PaymentHostel paymentHostel) {

    }
}
