package org.skypro.skyshop;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.basket.ProductBasket;

public class App {
    public static void main(String[] args) {
        Product product1 = new Product("Продукт 1", 10);
        Product product2 = new Product("Продукт 2", 20);
        Product product3 = new Product("Продукт 3", 30);
        ProductBasket basket = new ProductBasket();
        basket.addProduct(product1);
        basket.addProduct(product2);
        basket.addProduct(product3);
        basket.printContents();
        int totalCost = basket.getTotalCost();
        System.out.println("Общая стоимость корзины: " + totalCost);
        boolean containsProduct1 = basket.containsProduct("Продукт 1");
        boolean containsProduct4 = basket.containsProduct("Продукт 4");
        System.out.println("Продукт 'Продукт 1' есть в корзине: " + containsProduct1);
        System.out.println("Продукт 'Продукт 4' есть в корзине: " + containsProduct4);
        basket.clearBasket();
        basket.printContents();
        totalCost = basket.getTotalCost();
        System.out.println("Общая стоимость пустой корзины: " + totalCost);
        boolean containsProduct1InEmptyBasket = basket.containsProduct("Продукт 1");
        System.out.println("Продукт 'Продукт 1' есть в пустой корзине: " + containsProduct1InEmptyBasket);

    }
}
