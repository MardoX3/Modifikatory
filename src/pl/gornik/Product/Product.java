package pl.gornik.Product;

import java.util.List;
import java.util.Scanner;

public class Product {

    private String name;
    private String category;
    private double price;
    private double sizePack;
    private String unit;

    public Product(String name, String category, double price, double sizePack, String unit) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.sizePack = sizePack;
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public double getSizePack() {
        return sizePack;
    }

    public String getUnit() {
        return unit;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", category='" + category + '\'' +
                        ", price=" + price +
                        ", sizePack=" + sizePack +
                        ", unit='" + unit + '\'' +
                        '}';
    }

//    public double calculateUnitPrice(){
//        if(unit.equals("kg")){
//            return price/sizePack;
//        }
//        if(unit.equals("g")){
//            return (price/sizePack) * 1000;
//        }
//        return 0;
//    }                              GLUPOTA JAK 150

    public double calculateUnitPrice(){
        double unitPrice;
        switch (unit){
            case "kg", "l" -> {
                unitPrice = price/sizePack;
            }
            case "ml","g" -> {
                unitPrice = (price/sizePack) * 1000;
            }
            case "dag" ->{
                unitPrice = price*100/sizePack;
            }
            default ->{
                unitPrice = price/sizePack;
            }
        }
        return unitPrice;
    }

    public void displayProduct(){
        System.out.println("Jednostkowa cena produktu "+ sizePack + " " +unit+ " " + name + " wynosi " + calculateUnitPrice() + " zł");
    }
    public void choiceProduct(int number1,int number2){
            if(getName().toUpperCase().charAt(0) > number1 && getName().toUpperCase().charAt(0) < number2) {
                System.out.println("name='" + name + '\'' +
                        ", category='" + category + '\'' +
                        ", price=" + price +
                        ", sizePack=" + sizePack +
                        ", unit='" + unit + '\'' +
                        '}');
    }
}



}