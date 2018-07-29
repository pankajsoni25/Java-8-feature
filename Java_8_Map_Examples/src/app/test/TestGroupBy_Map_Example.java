package app.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestGroupBy_Map_Example {

    public static void main(String[] args) {

        List<Product> products = addListOfProducts();

        Map group = products.stream()
                                    .collect(Collectors.groupingBy(Product::getManufacturer,Collectors.counting()));
        for(Object groupn: group.keySet()){
            System.out.println("Group Name : = "+groupn);
            System.out.println("Products : = "+group.get(groupn));
            System.out.println("=======================================");
        }

        Map calculateGroup = products.stream()
                                    .collect(Collectors.groupingBy(Product::getManufacturer,Collectors.summingInt(Product::getQuantity)));
        for(Object groupn: calculateGroup.keySet()){
            System.out.println("Group Name : = "+groupn);
            System.out.println("Total Number Of Products : = "+calculateGroup.get(groupn));
            System.out.println("=======================================");
        }

    }

    public static List<Product> addListOfProducts() {
        List<Product> products = new ArrayList<>();
        Product p1 = new Product("p1","mobile 1", 1000L,2 , "Manufacturer 1");
        Product p2 = new Product("p2","mobile 2", 700L, 4, "Manufacturer 1");
        Product p3 = new Product("p3","laptop 1", 1200L, 6, "Manufacturer 2");
        Product p4 = new Product("p4","laptop 2", 7000L, 9, "Manufacturer 2");
        Product p5 = new Product("p5","laptop 3", 2300L, 7, "Manufacturer 2");
        products.addAll(Arrays.asList(p1,p2,p3,p4,p5));
        return products;
    }

}
