package com.buggybread;

import java.util.Arrays;
import java.util.List;

public class Question11 extends Base implements Interfac1{

    public static void main(String[] args) {
        Question11 a = new Question11();
        a.defaultMethod();

        List<String> str = Arrays.asList("Pankaj");
        str.add("Soni");
        String s = "";
        s.substring();
//        System.out.println(str);
    }





}

interface Interfac1{

    default public void defaultMethod(){
        System.out.println("DefaultMethodInterface2");
    }

}
class Base{

    public void defaultMethod(){
        System.out.println("Base DefaultMethodInterface2");
    }

}
