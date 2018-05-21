package com.pankaj;

/**
 * @author pankaj
 */
public class TernuryOperator {

    public static void main(String[] args) {

        Person person = new Person("Pankaj",24);
        System.out.println(testTernuryOperator(null));

    }

    private static boolean testTernuryOperator( Person person) {
        System.out.println(person);
        return person == null ? false : true;

    }


}
