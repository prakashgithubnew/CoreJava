package CoreJavaPractise.java8practise.MultipleFiltersUsingPRedicate;

import java.util.Arrays;
import java.util.List;

public class Sample2 {

    public static void main(String[] args){

        List<Product> products = Arrays.asList(
                new Product("Laptop", 800, "Electronics"),
                new Product("Phone", 500, "Electronics"),
                new Product("Shirt", 40, "Clothing"),
                new Product("Shoes", 60, "Clothing"),
                new Product("Headphones", 100, "Electronics")
        );
        List<String> categories = Arrays.asList("Electronics", "Clothing");

        List<Product> filteredProducts = products.stream()
                .filter(p -> categories.contains(p.category)) // Filters products that belong to specified categories
                .toList();
        filteredProducts.forEach(x->System.out.println(x.category));

    }
}
