package com.Collections;

import java.util.LinkedList;

public class DemoLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(10);
        list.add(19);
        list.add(14);
        list.add(12);
        list.add(16);
        list.add(11);
        System.out.println(list);
        list.remove(0);
        System.out.println(list.peekLast());
        list.set(1, 100);
        System.out.println(list);
        for (int element:list) {
            System.out.print(element+ " ");
        }

    }

}
