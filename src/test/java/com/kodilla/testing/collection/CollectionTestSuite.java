package com.kodilla.testing.collection;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

public class CollectionTestSuite {

    public OddNumbersExterminator exterminator = new OddNumbersExterminator();

    @Test
    public void testEmptyCollection() {

        //Given
        ArrayList<Integer> empty = new ArrayList <Integer>();

        //When
        ArrayList<Integer> withoutOdd = exterminator.exterminate(empty);

        //Then
        Assert.assertEquals(withoutOdd, new ArrayList<>());
    }

    @Test
    public void testNormalCollection() {
        //Given
        ArrayList<Integer> normal = new ArrayList <Integer>();
        normal.add(3);
        normal.add(1);
        normal.add(2);
        normal.add(6);
        normal.add(0);
        normal.add(1);
        normal.add(-16);

        //When
        ArrayList<Integer> realOutput = exterminator.exterminate(normal);

        ArrayList<Integer> expectedOutput = new ArrayList <Integer>();
        expectedOutput.add(2);
        expectedOutput.add(6);
        expectedOutput.add(0);
        expectedOutput.add(-16);

        //Then
        Assert.assertEquals(expectedOutput, realOutput);
        }
}
