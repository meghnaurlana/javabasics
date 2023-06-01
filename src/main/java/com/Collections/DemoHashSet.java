package com.Collections;

import java.util.HashSet;

public class DemoHashSet {
    public static void main(String[] args) {
        HashSet<Character> set = new HashSet<>();
        set.add('f');
        set.add('s');
        set.add('w');
        set.add('g');
        set.add('v');
        set.add('t');
        set.add('l');
        System.out.println(set);
        set.remove('w');
        System.out.println(set);
        System.out.println(set.isEmpty());
        System.out.println(set.size());

    }
}
