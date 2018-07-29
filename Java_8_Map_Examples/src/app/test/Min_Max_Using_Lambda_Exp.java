package app.test;

import java.util.List;

public class Min_Max_Using_Lambda_Exp {

    static List<Product> products = TestGroupBy_Map_Example.addListOfProducts();

    public static void main(String[] args) {
        System.out.println(products.stream().max((p1,p2)-> (int) (p1.getPrice() - p2.getPrice())).get().toString());
        System.out.println(products.stream().min((p1,p2)-> (int) (p1.getPrice() - p2.getPrice())).get().toString());
    }


}
