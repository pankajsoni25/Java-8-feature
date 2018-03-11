package io.javabrains;

/**
 * @author pankaj
 */
public class RunnableUsingLambda {

    public static void main(String[] a){
        Thread  myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Printed inside runnable ");
            }
        });

        myThread.start();

        Thread myLambdaThread = new Thread(()-> System.out.println("Printed inside Lambda runnable "));
        myLambdaThread.start();


    }


}
