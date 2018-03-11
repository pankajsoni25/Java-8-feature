package io.javabrains;

/**
 * @author pankaj
 */
public class TypeInferenceExample {

    interface StringLengthLambdas{
        int getLength(String s);
    }

    public static void main(String [] a){
        /* Validate lambdas format 1)*/
        StringLengthLambdas lambdas = (String s) -> s.length();
        lambdas.getLength("Hello Lambdas!");
        System.out.println(lambdas.getLength("Hello Lambdas!"));

        /* Validate lambdas format 2)
        * we don't specifies type because compiler figure out by its interface
        * */
        lambdas = (s) -> s.length();
        System.out.println(lambdas.getLength("Hello Lambdas!"));

        /* Validate lambdas format 3)
        * if we have only one argument then we don't need this parenthesis () so we can
        * remove this will still work.
        * */
        lambdas = (s) -> s.length();
        System.out.println(lambdas.getLength("Hello Lambdas!"));


        printLambadas(s -> s.length());
    }


    public static void printLambadas(StringLengthLambdas l){
        System.out.println(l.getLength("Hello world"));
    }
}
