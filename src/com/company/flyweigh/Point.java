package com.company.flyweigh;

public class Point implements IShape {

    @Override
    public void draw(int x, int y) {
        System.out.println("рисуем точку накординатах "+ x+" "+y);
    }
}
