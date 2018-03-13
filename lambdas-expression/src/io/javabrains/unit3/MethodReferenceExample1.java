package io.javabrains.unit3;

/**
 * @author pankaj
 */
public class MethodReferenceExample1 {

    /* See Rules For use method references */
    public static void main(String[] args) {

        /*This Is executing method which has no argument
        * This is method executing*/
//        Thread thread = new Thread(()->printMessage());

        /* When there is not input arguments and executing method with no parameters
        * Or there are certain parameter over here then we passing those parameter
        * to that method, if these to match, There is new Sintex for it.
        * that is Method References.
        * */

        /* How to use it?
        *
        * First You Give the class name Where you have the method
        * -> in this case MethodReferenceExample1 has printMessage()
        * So we use MethodReferenceExample1
        * and when you type two Colon Symbols then you follow that with name
        * of that method
        * (in this case printMessage, so Final will me MethodReferenceExample1::printMessage)
        * So this is > MethodReferenceExample1::printMessage expression
        * and this is equivalent to lambdas expression we have seen( is > ()->printMessage() )
        *
        * MethodReferenceExample1::printMessage === ()-> printMessage()
        * */
        Thread thread = new Thread(MethodReferenceExample1::printMessage);
        thread.start();

//        printMessage();
    }

    public static void printMessage() {
        System.out.println("Hello ");
    }


}
