package org.skypro.skyshop.searchable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchEngine {
    private List<Searchable> searchables;

    public SearchEngine(int size) {
        searchables = new ArrayList<>(size);
    }

    public void add(Searchable searchable) {
        if (hasSpaceForSearchable()) {
            searchables.add(searchable);
        } else {
            resizeSearchablesList();
            searchables.add(searchable);
        }
    }

    private void resizeSearchablesList() {
        int newSize = searchables.size() + 10;
        searchables = new ArrayList<>(newSize);
        for (int i = 0; i < searchables.size(); i++) {
            searchables.add(null);
        }
    }

    public Searchable search(String searchTerm, Searchable searchable) {
        if (searchable != null && searchable.getSearchTerm().contains(searchTerm)) {
            return searchable;
        }
        return null;
    }

    public void printContents() {
        if (searchables.size() == 0) {
            System.out.println("В поисковой базе данных пусто");
            return;
        }

        System.out.println("Содержимое поисковой базы данных:");

        for (Searchable searchable : searchables) {
            if (searchable != null) {
                System.out.println(searchable.getSearchTerm());
            }
        }
    }

    private boolean hasSpaceForSearchable() {
        return searchables.size() < searchables.size();
    }
}