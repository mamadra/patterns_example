package com.company.visitor;

public class Guest implements IVisitor {
    @Override
    public void visit(NumberHostel numberHostel) {
        System.out.println("Гость живет в номере");
    }

    @Override
    public void visit(BedNumber bedNumber) {
        System.out.println("Гость спит в кровати");
    }

    @Override
    public void visit(PaymentHostel paymentHostel) {
        System.out.println("Гость оплачивает проживание ");
    }
}
