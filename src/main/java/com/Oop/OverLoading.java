package com.Oop;

public class OverLoading {
    void add(int x, int y) {
        int z = x + y;
        System.out.println(z);
    }

    void add(int k, int j, int h) {
        int l = (k % j * h);
        System.out.println(l);
    }

    void add(float x, float y) {
        int k = (int) (x * y);
        System.out.println(k);
    }
}
