package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;

import java.util.Arrays;

public class ProductBasket {
    private final Product[] products = new Product[5];
    private int currentProductIndex = 0;

    public void addProduct(Product product) {
        if (hasSpaceForProduct()) {
            products[currentProductIndex] = product;
            currentProductIndex++;
        } else {
            System.out.println("Невозможно добавить продукт");
        }
    }

    public int getTotalCost() {
        int totalCost = 0;
        for (Product product : products) {
            if (product != null) {
                totalCost += product.getPrice();
            }
        }
        return totalCost;
    }

    public void printContents() {
        if (products.length == 0) {
            System.out.println("в корзине пусто");
            return;
        }

        System.out.println("Содержимое корзины:");

        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product != null) {
                System.out.println(product);
            }
        }
        System.out.println("Итого: " + getTotalCost());
        System.out.println("Специальных товаров: " + getSpecialProductCount());

    }
    private int getSpecialProductCount() {
        int count = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].isSpecial()) {
                count++;
            }
        }
        return count;
    }

    public boolean containsProduct(String name) {
        for (Product product : products) {
            if (product != null && product.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void clearBasket() {
        Arrays.fill(products, null);
        currentProductIndex = 0;
    }

    private boolean hasSpaceForProduct() {
        return currentProductIndex < products.length;
    }
}
