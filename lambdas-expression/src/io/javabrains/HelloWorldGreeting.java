package io.javabrains;

/**
 * @author pankaj
 */
public class HelloWorldGreeting implements Greeting{

    @Override
    public void perform(){
        System.out.println("Hello World Greeting ! ");
    }


}
