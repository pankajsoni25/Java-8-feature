package com.java9s.tutorials.java.generics;

/**
 * @author pankaj
 */
public class Main {

    public static void main(String[] args) {
        Color<Red,Green, Blue> color = new Color<Red, Green, Blue>();
        Bartender bartender = new Bartender();
        bartender.<Juice,Water>mix(new Juice(), new Water());
        bartender.mix(new Juice(), new Water());
    }

}
