package com.Collections;

import java.util.HashMap;

public class DemoHashMap {
    public static void main(String[] args) {
        HashMap<String, String> states = new HashMap<String, String>();
        states.put("Bihar", "Patna");
        states.put("Goa", "Panaji");
        states.put("Maharashtra", "Mumbai");
        states.put("Meghalaya", "Shillong");
        System.out.println(states);
        System.out.println(states.get("Bihar"));
        System.out.println(states.size());
        states.remove("Maharashtra");
        System.out.println(states);
        System.out.println(states.containsKey("Hyderabad"));
        states.clear();
        System.out.println(states);


    }
}
