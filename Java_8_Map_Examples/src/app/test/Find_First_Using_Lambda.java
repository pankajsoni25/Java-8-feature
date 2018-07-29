package app.test;

import java.util.List;
import java.util.Optional;

public class Find_First_Using_Lambda {

    static List<Product> products = TestGroupBy_Map_Example.addListOfProducts();

    public static void main(String[] args) {
        Optional<Product> product= products.stream().filter(p->p.getId().equalsIgnoreCase("p3"))
        .findFirst();
        System.out.println(product.isPresent() ? product.toString() : "Product Not Found");
    }
}
