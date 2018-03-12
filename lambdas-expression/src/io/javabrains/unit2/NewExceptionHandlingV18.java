package io.javabrains.unit2;

import java.util.function.BiConsumer;

/**
 * @author pankaj
 */
public class NewExceptionHandlingV18 {

    public static void main(String[] args) {

        int [] someNumbers = {1,2,3,4};
        int key = 0;

        processHandle(someNumbers, key, wrapperLamdas(( v, k ) -> System.out.println(v / k)));

        processHandle(someNumbers,key,wrapperLamdas((v,k) -> System.out.println(v/k)));

    }



    private static void processHandle(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
        for (int number : someNumbers){
            System.out.println("Innnnn");
            consumer.accept(number ,key);
        }
    }


   /* public static BiConsumer<Integer, Integer> wrapperLamdas(BiConsumer<Integer, Integer> consumer){
        System.out.println("Inside wrapper Lambdas");

        return (v, k)-> System.out.println(v+k);
//        return consumer;
    }*/


    /*public static BiConsumer<Integer, Integer> wrapperLamdas(BiConsumer<Integer, Integer> consumer){
        System.out.println("Inside wrapper Lambdas");

        return (v, k)->{
            System.out.println("Executing From Wrapper");
            consumer.accept(v,k);
        };
//        System.out.println(v+k);
//        return consumer;
    }*/

    /*The way below in the lambdas expression we handling
    *  Its looking so odd
    * processHandle(someNumbers, key, ( v, k ) ->{
            try{
                System.out.println(v / k);
            }catch (ArithmeticException e){
                e.printStackTrace();
            }
        } );

    * That's the reason why we create free Separate Lambdas Expression
    * which has inside on lambdas expression with try catch to hand exception
    * so free to use lambdas expression -> (wrapperLamdas((v,k) -> System.out.println(v/k)))
    * from try catch we create exception => processHandle(someNumbers,key,wrapperLamdas((v,k) -> System.out.println(v/k)));
    *
    * So we don't need try catch in calling calling lambdas (original - (wrapperLamdas((v,k) -> System.out.println(v/k))) )
    * and we have in wrapperLambdas one lambdas which has try catch block to handle exception
    * which handle our exception which occurs by original expression
    *
    * See complete this example with this lambdas expression and play with this for better expression
    * */
    private static BiConsumer<Integer, Integer> wrapperLamdas(BiConsumer<Integer, Integer> consumer){
            System.out.println("Inside wrapper Lambdas");

            return (v, k)->{
                System.out.println("Executing From Wrapper");
                try {
                    consumer.accept(v,k);
                }catch (ArithmeticException e ) {
                    System.out.println(e.getMessage());
                }
            };
    //        System.out.println(v+k);
    //        return consumer;
        }


}
