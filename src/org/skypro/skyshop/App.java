package org.skypro.skyshop;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.SimpleProduct;
import org.skypro.skyshop.product.FixPriceProduct;

public class App {
    public static void main(String[] args) {
        ProductBasket basket = new ProductBasket();
        Product product1 = new FixPriceProduct("Товар 1");
        Product product2 = new DiscountedProduct("Товар 2", 100, 50);
        Product product3 = new SimpleProduct("товар 3", 50);
        basket.addProduct(product1);
        basket.addProduct(product2);
        basket.addProduct(product3);

        basket.printContents();
        /*int totalCost = basket.getTotalCost();
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
        System.out.println("Продукт 'Продукт 1' есть в пустой корзине: " + containsProduct1InEmptyBasket);*/





    }
}
