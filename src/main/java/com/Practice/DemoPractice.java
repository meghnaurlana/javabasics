package com.Practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DemoPractice {
    public static void main(String[] args) {
        try {
            int x = 5;
            int y = 0;
            int add = x / y;
            System.out.println(add);
        } catch (Exception ef) {
            System.out.println(ef);
        }
        try {
            int a[] = new int[3];
            a[0] = 1;
            a[1] = 2;
            a[2] = 3;
            System.out.println(a[3]);

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("done");
        }
        try {
            String id = null;
            System.out.println((id.getClass()));
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            String name = "meghana";
            int z = Integer.parseInt(name);
            System.out.println(z);
        } catch (Exception e) {
            System.out.println(e);
        }
        int a = 5;
        int b = 4;
        int z = a | b;
        System.out.println(z);



        List<Boolean> list = new ArrayList<>();
        list.add(true);
        list.add(Boolean.parseBoolean("FalSe"));
        list.add(Boolean.TRUE);
        System.out.print(list.size());
        System.out.print(list.get(1) instanceof Boolean);


        String message = "Hello";
        for (int i = 0; i < message.length(); i++) {
            System.out.print(message.charAt(i + 1));
        }


        System.out.print(LocalDate.now());


        String messages = "Hello world!";
        String newMessage = messages.substring(6, 12)
                + messages.substring(12, 6);
        System.out.println(newMessage);
        int q = 900000000;
        System.out.println(q);
        List lists = new ArrayList();
        lists.add("hello");
        lists.add(2);
        System.out.print(lists.get(0) instanceof String);
        System.out.print(lists.get(1) instanceof Character);
    }

}





