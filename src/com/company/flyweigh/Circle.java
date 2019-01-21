package com.company.flyweigh;

public class Circle implements IShape {
    float r = 3;

    @Override
    public void draw(int x, int y) {
        System.out.println("рисуем круг накординатах " + x + " " + y + " со радиусом " + r);
    }
}
