package com.Collections;


import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(0);
        list.add(2);
        list.add(7);
        System.out.println(list);

        int element = list.get(1);
        System.out.println(element);

        list.add(0, 9);
        System.out.println(list);

        list.set(1, 4);
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        int size = list.size();
        System.out.println(size);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();


    }
}
