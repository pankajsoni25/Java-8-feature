package io.javabrains.thisReferenceV20;

/**
 * @author pankaj
 */
public class ThisReferenceExample {

    private void doProcess(int i, Process p){
        System.out.println("indoooooooo");
        p.process(i);
    }
    public static void main(String[] args) {
        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
//        System.out.println("this = "+this); // this will not work

        /* Here I am accessing  this reference actually this cannot be applied in static context,
        * But in anonymous inner class is void method so we can use it but
        * What is this reference is ?
        * Here this reference is happens to be the instance of this(anonymous inner class)
        * that we created- means thisReferenceExample
        *
        * Now notice->  Which Object is process() method part of ?
        * it's the part of the anonymous inner class Object That was created Over below
        * new Process() {
            @Override
            public void process(int i) {
                System.out.println("Value of i = "+i);
                System.out.println("this = "+this);
            }
        }
        * So this reference points to Process instance That was created inline by using new keyword
        * Ss that what's is refereeing to
        * That's what printed in the console */
        /* this is not java 8 this is classic Java  anonymous inner class
            And method of the inner class refereeing to instance of the anonymous inner class
            when you referred  this reference

            Actually in static we cannot able to access this but here we were working in
            instance of an Object, so this reference perfectly valid.

        */
        thisReferenceExample.doProcess(13, new Process() {
            @Override
            public void process(int i) {
                System.out.println("Value of i = "+i);
                System.out.println("this = "+this);
            }

            @Override
            public String toString() {
                return "This is the anonymous inner class   ";
            }
        });


        /* TODO Now I am using lambda expression of above method call
        * instead of anonymous inner class I will write here lambdas expression
        * */
        thisReferenceExample.doProcess(10,i->{
            /* Here I am copy two lines from process method Overridden of above anonymous inner class */
            System.out.println("Value of i = "+i);
//            System.out.println("this = "+this); // this will not work
            /* Notice what happens
            * Why is that? I am not using not inside psvm directly , I am using inside lambdas
            * expression, but why is still complaining
            * ans=) It's complain because lambdas treat this reference
            * in silently different way then anonymous inner class,
            * In the case of anonymous inner class we already seen(above)
            * this reference refers to the  instance of that anonymous inner class ,
            * but in the case of lambdas the instance of lambdas doesn't touch
            * this reference , The this reference is unmodified when we are using it in lambdas
            * expression, This is intentional, this is by design
            *
            * So when you using a lambdas expression in any part of the code the value of the
            * this reference is basically same as What the this reference would have been outside
            * the lambdas expression, The lambdas expression doesn't override the this reference
            * So you can see the line no. 62 treat as line no. 14 (Which is outside of lambdas exp)
            * both are treating as same treating as outside and inside of lambdas.
            * Both are still giving an error
            *
            * Now We going to create one instance method execute(){This method not static} below it and there we will
            * call doProcess() into it calling below in psvm
            * */
            thisReferenceExample.execute();

        });
    }

    public void execute(){
        // this === ?
        /*
        * here this point to instance of the object on execute()
        * method has been called ?
        * now what's the instance on execute() method been called
        * thisReferenceExample(Object)
        * So this will point to thisReferenceExample(instance) instance.
        *
        * So, this will point to the instance of the Object which will call the
        * execute() method(here is thisReferenceExample).
        *
        *  */
        System.out.println(this);

        doProcess(10,i->{
            System.out.println("Inside execute() ---------------");
            System.out.println("Value of i = "+i);
            /* outside and inside both are treat same as expected */
            System.out.println("this = "+this); // this will not work
        });
    }

    public String toString(){
        return "This is the main ThisReferenceExample class instance";
    }

    /**TODO: Remember
     * In a natural What we need to Remember?
     * In a  anonymous inner class when using this reference you basically
     * have overwritten this reference the anonymous inner class instance
     * Overwrite this reference the value change inside that anonymous inner class,
     * In case of lambdas that doesn't happen. This Still refers to instance that
     * it point to outside of the lambdas. There is not overriding happens.
     * */
}

interface Process{
    void process(int i);
}