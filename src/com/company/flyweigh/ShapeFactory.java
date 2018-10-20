package com.company.flyweigh;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private static final Map<String,IShape> shapes=new HashMap<>();

    public IShape getShape(String shapeName){
        IShape shape=shapes.get("shapeName");
        if(shape==null){
            switch (shapeName) {
                case "круг":
                    shape = new Circle();
                    break;
                case "квадрат":
                    shape = new Square();
                    break;
                case "точка":
                    shape = new Point();
                    break;
            }
        shapes.put(shapeName,shape);
        }
        return shape;
    }
}
