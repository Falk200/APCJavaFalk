package org.example;

import java.util.*;

public class ShapeAnalyzer {

    public static List<Shape> filterByMinArea(Collection<? extends Shape> shapes, double minArea){
        List<Shape> filteredShapes = new ArrayList<>();
        for (Shape shape : shapes) {
            if (shape.getArea() >= minArea){
                filteredShapes.add(shape);
            }
        }
        return filteredShapes;
    }

    public static Shape findShapeWithMaxArea(Collection<? extends Shape> shapes){
        double maxArea = 0;
        Shape maxAreaShape = null;
        for (Shape shape : shapes) {
            if (shape.getArea() > maxArea){
                maxAreaShape = shape;
            }
        }
        return maxAreaShape;
    }

    public static <T extends Shape> Map<String, List<T>> groupByType(Collection<T> shapes){
        Map<String, List<T>> groups = new HashMap<>();
        for (Shape shape : shapes) {
            String name = shape.getClass().getSimpleName();
            List<T> group = new ArrayList<>();
            for (T currentShape : shapes) {
                if (currentShape.getClass().getSimpleName().equals(name)){
                    group.add(currentShape);
                }
            }
            groups.put(name, group);
        }
        return groups;
    }
}
