package pl.gornik;

import pl.gornik.Product.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        Product product1 = new Product("mleko", "nabial", 4.50, 500, "ml");
        Product product2 = new Product("olej", "tluszcze", 8.50, 1, "l");
        Product product3 = new Product("ser", "nabial", 5.50, 100, "g");
        Product product4 = new Product("chleb", "pieczywo", 3, 1, "szt");
        Product product5 = new Product("kielbasa", "miesne", 30, 1, "kg");
        Product product6 = new Product("rogal", "pieczywo", 2.50, 1, "szt");

        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
        productList.add(product6);

        for (int i = 0; i < productList.size(); i++) {
            System.out.println(productList.get(i));
        }
        System.out.println("-----------------------------------------------------");
        for (Product product : productList) {
            System.out.println(product);
        }
        System.out.println("-Produkty z wybranej kategorii------------------------------------------------------");
        for (Product product : productList) {
            if (product.getCategory().equalsIgnoreCase("nabial")) {
                System.out.println(product);
            }
        }
        System.out.println("-Produkty zaczynajace się od A do K------------");
        for (Product product : productList) {
            if(product.getName().toUpperCase().charAt(0) > 64 && product.getName().toUpperCase().charAt(0) < 76) {
                System.out.println(product);
            }
        }
        System.out.println("-Produkty zaczynajace się od F do P--------------");
        for (Product product : productList){
            if(product.getName().toUpperCase().charAt(0) > 70 && product.getName().toUpperCase().charAt(0) < 80) {
                System.out.println(product);
            }
        }
        System.out.println("-Produkty z jednostkową cena-------------------");
        for(Product product : productList){
            System.out.println("Jednostkowa cena produktu " + product.getName() + " wynosi " + product.calculateUnitPrice()+ " zł");
        }

        System.out.println("----");
        for(Product product : productList){
            product.displayProduct();
        }
    }
}

