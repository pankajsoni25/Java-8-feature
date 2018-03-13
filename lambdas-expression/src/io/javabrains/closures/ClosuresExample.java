package io.javabrains.closures;

/**
 * @author pankaj
 */
public class ClosuresExample {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        doProcess(a, new Process() {
            @Override
            public void process(int i) {
//                b = 40;
                System.out.println();
                System.out.println(i + b);
            }
        });

        /*TODO Point to be note for better understaing */
        /*Here i am calling this method using lambdas expression and override as well in it */


        /*lambda expression  (i -> System.out.println(i+b))
        * this is passed to doProcess(i), now doProcess() accept it and it gonna
        * execute it the p.process(i) inside doProcess()
        *
        * When does it execute it ?
        * this will execute the lambda expression(i -> System.out.println(i+b)) body(System.out.println(i+b))
        *
        * Now where is b comming from in doProcess() into p.process()
        * This is the thing called closure
        * ==> Whenever the kambdas expression*/
        doProcess(a, i -> System.out.println(i+b));
    }

    /* Here is what happening
    Let's say want to change the value of b = 40 ;
    compiler will throw the error,
    because of the
    doProcess() calling process() method which has only one int and
    so that couldn't be take the parameter by process() and
    use into it.

    and before Java 8 if we want to use that b in that @Override process
    method then we have to make that variable final.
    But in java 8 which will assume this would be final so we can use it
    but we try to change then it will compilation error is -> Variable 'b' is accessed from
    within inner class, need to be final or effectively final


    * Before Java
    *
    *
    * */

    private static void doProcess(int i, Process p){
        System.out.println("indoooooooo");
        p.process(i);
    }

}

interface Process{
    void process(int i);
}
