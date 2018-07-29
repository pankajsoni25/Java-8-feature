package app.test;

import java.util.List;

public class Count_Using_Lambda_Exp {

    static List<Product> products = TestGroupBy_Map_Example.addListOfProducts();

    public static void main(String[] args) {
        System.out.println(products.stream().filter(p-> p.getPrice() > 1000).count());
    }


}
