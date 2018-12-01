package com.kodilla.testing.collection;

import java.util.ArrayList;

class CollectionTestSuite {
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> empty = new ArrayList <Integer>();
        //When
        OddNumbersExterminator exterminate = new OddNumbersExterminator();

        ArrayList<Integer> withoutOdd = exterminate.exterminate(empty);
        //Then
        if(withoutOdd.isEmpty()) {
            System.out.println("Is empty");
        } else{
            System.out.println("Is not empty");
            }

    }

}
