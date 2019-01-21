package com.company.visitor;

public interface IVisitor {
    void visit(NumberHostel numberHostel);

    void visit(BedNumber bedNumber);

    void visit(PaymentHostel paymentHostel);
}
