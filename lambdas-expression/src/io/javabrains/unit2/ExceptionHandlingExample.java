package io.javabrains.unit2;

import java.util.function.BiConsumer;

/**
 * @author pankaj
 */
public class ExceptionHandlingExample {

    public static void main(String[] args) {
        int [] someNumbers = {1,2,3,4};
        int key = 0;

//        process(someNumbers,0);
//        process(someNumbers,key, ( v, k )-> System.out.println(v + k));

        /* IF i pass key = 0 then it will throw Arithmetic Exception */
        process(someNumbers, key, ( v, k ) -> System.out.println(v / k));


        /*1) Handling Exception in method */
        processHandle(someNumbers, key, ( v, k ) -> System.out.println(v / k));

        /*1) Handling Exception in method in lambda expression it self */
        processHandle(someNumbers, key, ( v, k ) ->{
            try{
                System.out.println(v / k))
            }catch (ArithmeticException e){
                e.printStackTrace();
            }
        } );

        
    }

    private static void process(int[] someNumbers, int key) {
        for (int number : someNumbers){
            System.out.println(number + key);
        }
    }

    private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
        for (int number : someNumbers){
            System.out.println();
            consumer.accept(  number ,key);
        }
    }

    private static void processHandle(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
        for (int number : someNumbers){
            System.out.println();
            consumer.accept(  number ,key);
        }
    }
}
