package com.company.flyweigh;

public class Square implements IShape {
    float a=5;

    @Override
    public void draw(int x, int y) {
     System.out.println("рисуем квадрат накординатах "+ x+" "+y+" со стороной "+a);
    }
}
