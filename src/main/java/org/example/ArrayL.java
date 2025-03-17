package org.example;

import java.util.ArrayList;

public class ArrayL{


    public void ArrayL() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(15);

        list.removeIf(i -> i < 10);
        System.out.println(list);
    }


}
