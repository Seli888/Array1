package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class App {
    public static void main(String[] args) {
        ArrayList <Integer> someNumbers = new ArrayList<Integer>();
        someNumbers.add(1);
        someNumbers.add(-2);
        someNumbers.add(-3);
        someNumbers.add(5);
        someNumbers.add(0);
        ArrayList <Integer> firstList = new ArrayList<>();
        ArrayList <Integer> secondList = new ArrayList<>();


            for (int i = 0; i < someNumbers.size(); i++){
                if (someNumbers.get(i) < 0) {
                    firstList.add(someNumbers.get(i));
                } else {
                    secondList.add(someNumbers.get(i));
                } if (someNumbers.get(i) == 0) {
                    System.out.println("Элемент списка номер: " + i + " равен 0!" );
                }
            }
        System.out.println(firstList);
        System.out.println(secondList);
    }



}
