package org.example;

public class ShapeFactory {

    public static Shape fromString(String input){
        Shape shape = null;
        if (input.contains("Circle")){
            double radius = Double.parseDouble(input.split("radius=")[1]);
            shape = new Circle(radius);
        }
        else if (input.contains("Rectangle")){
            String[] values = input.split("=");
            double x = Double.parseDouble(values[1].split(",")[0]);
            double y = Double.parseDouble(values[2]);
            shape = new Rectangle(x, y);
        }
        else throw new IllegalArgumentException("Shape could not be parsed");
        return shape;
    }
}
