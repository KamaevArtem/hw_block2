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
        /*ProductBasket basket = new ProductBasket();
        Product product1 = new FixPriceProduct("Товар 1");
        Product product2 = new DiscountedProduct("Товар 2", 100, 50);
        Product product3 = new SimpleProduct("товар 3", 50);
        basket.addProduct(product1);
        basket.addProduct(product2);
        basket.addProduct(product3);

        basket.printContents();*/
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

        /*searchEngine = new SearchEngine(5);

        SimpleProduct product1 = new SimpleProduct("Товар 1", 10);
        SimpleProduct product2 = new SimpleProduct("Товар 2", 20);
        SimpleProduct product3 = new SimpleProduct("Товар 3", 30);
        SimpleProduct product4 = new SimpleProduct("Товар 4", 40);
        SimpleProduct product5 = new SimpleProduct("Товар 5", 50);

        searchEngine.add(product1);
        searchEngine.add(product2);
        searchEngine.add(product3);
        searchEngine.add(product4);
        searchEngine.add(product5);

        Article article1 = new Article("Статья 1", "Текст статьи 1");
        Article article2 = new Article("Статья 2", "Текст статьи 2");
        Article article3 = new Article("Статья 3", "Текст статьи 3");

        searchEngine.add(article1);
        searchEngine.add(article2);
        searchEngine.add(article3);

        String searchTerm = "Товар 2";
        Searchable searchable = searchEngine.search(searchTerm, product2);
        if (searchable != null) {
            System.out.println(searchable.getSearchTerm());
        } else {
            System.out.println("Результаты поиска не найдены.");
        }   */
        /*try {
            SimpleProduct product1 = new SimpleProduct("Valid Product", 5);
            DiscountedProduct product2 = new DiscountedProduct("Valid Product", 0, 10);
            DiscountedProduct product3 = new DiscountedProduct("Valid Product", -5, 10);
            DiscountedProduct product4 = new DiscountedProduct("Valid Product", 10, 110);

            System.out.println("Product 1: " + product1.getName());
            System.out.println("Product 2: " + product2.getName());
            System.out.println("Product 3: " + product3.getName());
            System.out.println("Product 4: " + product4.getName());
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }*/

        /*ProductBasket basket = new ProductBasket();

        Product product1 = new FixPriceProduct("Товар 1");
        Product product2 = new DiscountedProduct("Товар 2", 20, 50);
        Product product3 = new FixPriceProduct("Товар 3");
        Product product4 = new DiscountedProduct("Товар 4", 260, 50);

        basket.addProduct(product1);
        basket.addProduct(product2);
        basket.addProduct(product3);
        basket.addProduct(product4);

        basket.printContents();

        String productNameToRemove = "Товар 1";
        List<Product> removedProducts = basket.removeProductsByName(productNameToRemove);
        System.out.println("Удаленные продукты:");
        for (Product product : removedProducts) {
            System.out.println(product);
        }
        basket.printContents();

        productNameToRemove = "Товар 5";
        removedProducts = basket.removeProductsByName(productNameToRemove);
        if (removedProducts.size() == 0) {
            System.out.println("Список пуст");
        }
        basket.printContents();

        System.out.println("Содержимое корзины после удаления:");
        basket.clearBasket();
        basket.printContents();

        System.out.println("______________________");

        SearchEngine searchEngine = new SearchEngine();
        Searchable searchable1 = new SearchableImpl("Продукт А", "product", "наименования 1");
        Searchable searchable2 = new SearchableImpl("Продукт B", "product", "наименования 2");
        Searchable searchable3 = new SearchableImpl("Продукт C", "product", "наименования 3");
        Searchable searchable4 = new SearchableImpl("Продукт D", "product", "наименования 4");


        searchEngine.add(searchable1);
        searchEngine.add(searchable2);
        searchEngine.add(searchable3);
        searchEngine.add(searchable4);

        String searchTerm = "про";
        List<Searchable> matchingResults = searchEngine.search(searchTerm);
        System.out.println("Соответствующие объекты для поиска \"" + searchTerm + "\":");
        for (Searchable searchable : matchingResults) {
            System.out.println(searchable.getSearchTerm());
        }

        searchEngine.printContents();*/

        SearchEngine searchEngine = new SearchEngine();

        Searchable searchable1 = new SearchableImpl("Объект 1", "Содержание 1", "Наименования 1");
        Searchable searchable2 = new SearchableImpl("Объект 1", "Содержание 2", "Наименования 2");
        Searchable searchable3 = new SearchableImpl("Объект 1", "Содержание 3", "Наименования 3");
        searchEngine.addSearchable(searchable1);
        searchEngine.addSearchable(searchable2);
        searchEngine.addSearchable(searchable3);
        searchEngine.printSearchResults("Содержание");

    }
}
