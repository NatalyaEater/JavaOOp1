package org.example;
import java.util.Scanner;

/*Домашнее задание на закрепление:
5)Вывести на консоль каталог продуктов.
6)Вывести на консоль покупки посетителей магазина.

 */
public class Main {
    public static void main(String[] args) {
        User newUser = new User("vasya", "00000");


        System.out.println("Добро пожаловать!");

        Category moloko = new Category();
        Product productToAdd=new Product("Молоко из Кореновки",100,5);
        Product productToAdd1=new Product("Молоко Козье",50,3);
        Product productToAdd2=new Product("Молоко обезжиренное",180,4);
        moloko.addProduct(productToAdd);
        moloko.addProduct(productToAdd1);
        moloko.addProduct(productToAdd2);


        System.out.println("Список  товаров:");
        for (Product myProduct: moloko.getProducts()) {
            System.out.println("Наименование: " + myProduct.getName()  );
            System.out.println("Стоимость: " + myProduct.getPrice() + " руб");
            System.out.println("Рейтинг: " + myProduct.getRating()  );

            System.out.println("\n");
        }
        System.out.println();

        newUser.addProductToUserBasket(productToAdd1);

        System.out.println("Ваша корзина:");
        System.out.println("*************************************");
        for (Product myProduct: newUser.getUserBasket().getProducts()) {
            System.out.println("Наименование: " + myProduct.getName()  );
            System.out.println("Стоимость: " + myProduct.getPrice() + " руб");
            System.out.println("Рейтинг: " + myProduct.getRating()  );

            System.out.println("\n");
        }
        System.out.println();
    }
}