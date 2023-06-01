package com.Collections;

import java.util.LinkedHashSet;

public class DemoLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Character> set = new LinkedHashSet<Character>();
        set.add('q');
        set.add('d');
        set.add('a');
        set.add('e');
        set.add('g');
        System.out.println(set);
        for (Character e : set) {
            System.out.print(e + " ");
        }

    }


}
