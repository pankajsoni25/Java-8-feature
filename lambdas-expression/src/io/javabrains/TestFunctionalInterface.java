package io.javabrains;

/**
 * @author pankaj
 */
/* The Function Interface is use for the make use it's gonna have only one abstract
* method because this functional interface will be using by lambda expression so
* it can be have only one abstract method if in case we will try to add one
* more method then our lambda expression will be fail so this is the reason why we
* adding FunctionInterface to developer make sure
* to have only one abstract method, If he will try to add then it will not gonna be compile
* */
/* FunctionalInterface is use for the make sure it's is using
* lambda expression and make sure it will be having only one abstract method ,
* So for convenience and making sure not one can add another method else
* our lambda expression will be fail
* that's the reason why we using FunctionalInterface
* to making sure that, one can add method into this interface
* =>>This is for best practices so we will
* ensure that is must have only one method */

/* This is for enforce to developer no need to add any method apart from
* that exist or only one you can add in this interface */


/*The @FunctionalInterface annotation is completely optional.
* Java Compiler does not require it for lambda Type.
* But it is good practice to add it */
@FunctionalInterface
public interface TestFunctionalInterface {

    public void perform();

//    public void another();

}
