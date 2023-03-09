package org.example;

import java.util.ArrayList;
import java.util.List;
/*3)Создать класс Basket, содержащий массив купленных товаров.

 */


import java.util.List;

public class Basket {

    private List<Product> products = new ArrayList<>();

    public Basket() {

    }

    public void addProduct(Product product) {
        products.add(product);
    }
    public List<Product> getProducts() {
        return products;
    }


}

