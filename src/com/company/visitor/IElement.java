package com.company.visitor;


public interface IElement {
    void accept(IVisitor visitor);
}
