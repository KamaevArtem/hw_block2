package org.skypro.skyshop;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.SimpleProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.searchable.SearchEngine;
import org.skypro.skyshop.searchable.Searchable;

public class App {
    private SearchEngine searchEngine;
    public static void main(String[] args) {
        App app = new App();
        app.start();
    }
    public void start() {
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

        searchEngine = new SearchEngine(5);

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
        Searchable searchable = searchEngine.search(searchTerm, product2); // Передаем объект product2
        if (searchable != null) {
            System.out.println(searchable.getSearchTerm()); // Исправлена ошибка с getSearchTerm()
        } else {
            System.out.println("Результаты поиска не найдены.");
        }

    }
}
