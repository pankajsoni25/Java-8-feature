package io.javabrains;

/**
 * @author pankaj
 */
public class Greeter {

    public static void main(String[] a){
        Greeter greeter = new Greeter();
        HelloWorldGreeting h = new HelloWorldGreeting();
        h.perform();

        /* Interface name really doesn't matter over here */
        /* and also method name also here doesn't matter here */

        /*All the matter is name of interface should be same as the type of argument*/
        /*If in case we gone add one more method in greeting interface the complier confuse
        * because when complier check i greeting interface there would be two method so
        * compiler dont know to using this interface for which method
        * (like to see in Greeting have one for method add)
        * So when we use interface for lambdas expression then interface should have only one method
        *
        * */
        MyLambdas myLambadas = () -> System.out.println("Hello World Greeting !");
        Greeting greeting = () -> System.out.println("Hello World Greeting !");
        Myadd myadd = (int x, int b) -> x+b;

    }
}

interface MyLambdas{
    void foo();
}

interface Myadd{
    int test(int a, int b);
}