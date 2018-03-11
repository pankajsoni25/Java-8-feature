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
        /*If in case we gone add one more method in greeting interface the compiler confuse
        * because when compiler check i greeting interface there would be two method so
        * compiler don't know to using this interface for which method
        * (like to see in Greeting have one for method add)
        * So when we use interface for lambdas expression then interface should have only one method
        *
        * */
        MyLambdas myLambadas = () -> System.out.println("Hello World Greeting !");
        Greeting greeting = () -> System.out.println("Hello World Greeting !");

        Myadd myadd = (int x, int b) -> x+b;

        Greeter.testDifference();
    }

    private static void testDifference() {
        Greeter greeter = new Greeter();

        Greeting h = new HelloWorldGreeting();

        /* this lambdas expression kind of behaving like a implementation of this
        * (Greeting)interface Greeting
        * What we have here is implementation of this foo() method for the Greeting interface
        * In a we are implementing an interface by just implementing a function a
        * not implementing a class = this is inline function implementing and assign to Greeting Type Interface
        * and Line 35 we created a new class that implemented Greeting and then we provided
        * logic in that class
        */
        Greeting greeting = () -> System.out.println("Hello World Greeting !");

        greeting.perform();
        h.perform();

        Greeting anonymousInnrerClass = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Inner Class Implementation Greeting !");
            }
        };

        anonymousInnrerClass.perform();

        greeter.greet(anonymousInnrerClass);
        greeter.greet(greeting);

        /*TODO*/
        /*What happening here Java Compiler do oh this is the lambdas expression
         * [() -> System.out.println("Hello World Greeting !")]
         * that i need to be use, Now where does it going , its going to greet method
         * which takes Greeting interface, Now compiler tries to match
         * the lambdas express with the Greeting interface
         * because of using greeting interface..
         * That's is type inference for you.*/
        greeter.greet(() -> System.out.println("Hello World Greeting !"));


    }

    public void greet(Greeting greeting){
        greeting.perform();
    }

}

interface MyLambdas{
    void foo();
}

interface Myadd{
    int test(int a, int b);
}