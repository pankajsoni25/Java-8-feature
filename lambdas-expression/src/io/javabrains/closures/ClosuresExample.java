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
        * What does it execute it ?
        * this will execute the lambda expression(i -> System.out.println(i+b)) body(System.out.println(i+b))
        *
        * Now where is b coming from in doProcess() into p.process() method,
        * This is the thing called closure(Line no. 11)
        * ==> Whenever the lambdas expression here and using something in the scope
        * some kind of variable in the scope
        *
        * what the java compiler and Java runtime do here ?
        * this will some kind of freeze the value and say this lambda expression using b, and
        * b happens this time 20, Which gonna freeze the value, along with the lambda expression,
        * So where ever this lambda expression goes, And whenever access the value of b, it takes the frozen
        * in value of b,
        * because this could go (lambda exp) and this doProcess() could execute somewhere later in time,
        * by that time may be b has to change some other different value, doesn't matter,
        *
        * doProcess()'s Process it's gonna contain the frozen value of b.
        * so where ever that lambda expression goes that frozen along with it.
        *
        * */
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
