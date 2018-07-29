package app.test;

import java.util.List;
import java.util.Map;

public class TestLimitOperatorInLambda {

    static List<Product>  products = TestGroupBy_Map_Example.addListOfProducts();

    public static void main(String[] args) {
        products.stream().
                sorted((p1,p2)-> (int) (p1.getPrice() - p2.getPrice()))
                .limit(2)
                .forEach(System.out::println);
    }

}
