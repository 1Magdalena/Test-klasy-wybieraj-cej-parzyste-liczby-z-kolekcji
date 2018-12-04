package com.streams;

import org.junit.Assert;
import org.junit.Test;

public class ShapeCollectorTest {

    ShapeCollector shapeCollector = new ShapeCollector();

    @Test
    public void addShape() {

        //Given
        Shape square = new Square(5);

        //When
        shapeCollector.addShape(square);

        //Then
        Assert.assertTrue(shapeCollector.getShapes().size() == 1);

    }

    @Test
    public void deleteShape() {
    }

    @Test
    public void deleteShape1() {
    }

    @Test
    public void getShapes() {
    }
}