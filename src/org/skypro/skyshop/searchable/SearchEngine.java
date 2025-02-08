package org.skypro.skyshop.searchable;

import java.util.*;

public class SearchEngine {
    private Map<String, Searchable> searchIndex = new HashMap<>();

    public void addContent(Searchable content) {
        searchIndex.put(content.getSearchTerm(), content);
    }

    public Set<Searchable> search(String searchTerm) {
        Set<Searchable> results = new TreeSet<>(new SearchableComparator());
        results.addAll(searchIndex.values());
        return results;
    }

}
