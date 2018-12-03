package com.kodilla.testing.collection;

import java.util.ArrayList;


class OddNumbersExterminator {

    ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
        ArrayList<Integer> even = new ArrayList<Integer>();

        for (int i = 0; i < numbers.size(); i++){
            int number = numbers.get(i);
            if (number % 2 == 0){
                even.add(number);
            }
        }
        return even;
    }
}

