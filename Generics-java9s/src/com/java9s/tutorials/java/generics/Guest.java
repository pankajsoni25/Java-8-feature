package com.java9s.tutorials.java.generics;

/**
 * @author pankaj
 */



public class Guest {
    public static void main(String[] args) {
        Glass<Juice> glass = new Glass<Juice>();
        Juice j = new Juice();
        glass.juice = j;
        Glass<Water> waterGlass = new Glass<Water>();
        Water water = new Water();
        waterGlass.juice = water;
        Water water1= waterGlass.juice;
        Juice juice =  glass.juice;

    }
}
