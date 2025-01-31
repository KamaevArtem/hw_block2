package org.skypro.skyshop.searchable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SearchEngine {
    private final Map<String, Searchable> searchableMap = new HashMap<>();

    public void addSearchable(Searchable searchable) {
        searchableMap.put(searchable.getName(), searchable);
    }

    public Map<String, Searchable> search(String searchQuery) {
        Map<String, Searchable> resultMap = new HashMap<>();
        searchableMap.entrySet().stream()
                .filter(entry -> entry.getValue().getName().contains(searchQuery) || entry.getValue().getContentType().contains(searchQuery))
                .forEachOrdered(entry -> resultMap.put(entry.getKey(), entry.getValue()));
        return resultMap;
    }

    public void printSearchResults(String searchQuery) {
        Map<String, Searchable> searchResults = search(searchQuery); // Пример поискового запроса
        System.out.println("Результаты поиска для '" + searchQuery + "':");
        searchResults.entrySet().stream()
                .map(entry -> entry.getValue().getStringRepresentation())
                .forEachOrdered(System.out::println);
    }
}

