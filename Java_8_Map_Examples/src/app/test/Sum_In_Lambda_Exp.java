package app.test;

import java.util.List;

public class Sum_In_Lambda_Exp {

    static List<Product> products = TestGroupBy_Map_Example.addListOfProducts();

    public static void main(String[] args) {
        System.out.println(products.stream().mapToInt(Product::getQuantity).sum());
        System.out.println(products.stream().filter(p->p.getName().startsWith("mobile")).mapToInt(Product::getQuantity).sum());
        System.out.println(products.stream().filter(p->p.getName().startsWith("laptop")).mapToInt(Product::getQuantity).sum());
        System.out.println(products.stream().mapToLong(p-> p.getQuantity() * p.getPrice()).sum());


    }

}
