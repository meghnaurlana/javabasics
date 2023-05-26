package com.Strings;

public class Strings {
    public static void main(String[] args) {
        String name = "Meghana";
        String fullname = "Meghana";
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(1));
        System.out.println(name.concat("Urlana"));
        System.out.println(name.equalsIgnoreCase("meghana"));
        System.out.println(name.equals("meghana"));
        System.out.println(name.indexOf('a'));
        System.out.println(name.lastIndexOf('a'));
        System.out.println(name.compareTo(fullname));
    }
}
