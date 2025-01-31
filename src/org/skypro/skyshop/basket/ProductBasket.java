package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ProductBasket {
    private final Map<String, List<Product>> productsMap = new HashMap<>();

    public void addProduct(Product product) {
        List<Product> productsByName = productsMap.get(product.getName());
        if (productsByName == null) {
            productsByName = new ArrayList<>();
            productsMap.put(product.getName(), productsByName);
        }
        productsByName.add(product);
    }

    public int getTotalCost() {
        int totalCost = 0;
        for (List<Product> products : productsMap.values()) {
            for (Product product : products) {
                if (product != null) {
                    totalCost += product.getPrice();
                }
            }
        }
        return totalCost;
    }

    public void printContents() {
        if (productsMap.isEmpty()) {
            System.out.println("в корзине пусто");
            return;
        }

        System.out.println("Содержимое корзины:");

        for (List<Product> products : productsMap.values()) {
            for (Product product : products) {
                if (product != null) {
                    System.out.println(product);
                }
            }
        }
        System.out.println("Итого: " + getTotalCost());
        System.out.println("Специальных товаров: " + getSpecialProductCount());
    }

    private int getSpecialProductCount() {
        int count = 0;
        for (List<Product> products : productsMap.values()) {
            for (Product product : products) {
                if (product != null && product.isSpecial()) {
                    count++;
                }
            }
        }
        return count;
    }

    public boolean containsProduct(String name) {
        List<Product> products = productsMap.get(name);
        return products != null && products.size() > 0;
    }

    public void clearBasket() {
        productsMap.clear();
    }

    public List<Product> removeProductsByName(String name) {
        List<Product> removedProducts = productsMap.get(name);
        productsMap.remove(name);
        return removedProducts;
    }
}
