package com.streams;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void deleteShape(Shape shape) {
        shapes.remove(shape);
    }

    public void deleteShape(int shapeNr) {
        shapes.remove(shapeNr);
    }

    public List<Shape> getShapes() {
        return shapes;
    }
}
