package org.skypro.skyshop;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.SimpleProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.searchable.SearchEngine;
import org.skypro.skyshop.searchable.Searchable;
import org.skypro.skyshop.searchable.SearchableImpl;

import java.util.List;

public class App {
    public static void main(String[] args) {
        SearchEngine searchEngine = new SearchEngine();

        searchEngine.addContent(new FixPriceProduct("FixProduct1"));
        searchEngine.addContent(new FixPriceProduct("FixProduct2"));


        System.out.println("Сценарий 1: Разные длины имен");
        System.out.println(searchEngine.search("Product"));


        searchEngine.addContent(new FixPriceProduct("FixProduct33"));
        searchEngine.addContent(new FixPriceProduct("FixProduct44"));


        System.out.println("Сценарий 2: Одинаковая длина имен");
        System.out.println(searchEngine.search("Product"));



        searchEngine.addContent(new FixPriceProduct("FixProduct111"));
        searchEngine.addContent(new FixPriceProduct("FixProduct222"));


        System.out.println("Сценарий 3: Имена с одинаковыми длинами и разными значениями");
        System.out.println(searchEngine.search("Product"));
    }
    }
