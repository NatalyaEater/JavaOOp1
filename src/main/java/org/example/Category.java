package org.example;
import java.util.ArrayList;
import java.util.List;

/*2)Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.

 */


public class Category {

    private String name;
    private List<Product> products = new ArrayList<>();

    public Category() {

    }

    public Category(String name) {
        this.name = name;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public String getName() {
        return name;
    }

    public List<Product> getProducts() {
        return products;

    }
}







