package org.skypro.skyshop.searchable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.skypro.skyshop.searchable.Searchable;

public class SearchEngine {
    private Searchable[] searchableArray;


    public SearchEngine(int size) {
        searchableArray = new Searchable[size];
    }

    public void add(Searchable searchable) {
        searchableArray = searchableArray.clone();
        searchableArray[searchableArray.length - 1] = searchable;
    }

    public Searchable[] search(String searchTerm) {
        List<Searchable> results = new ArrayList<>();
        for (Searchable searchable : searchableArray) {
            if (searchable!=null && searchable.getSearchTerm().contains(searchTerm)) {
                results.add(searchable);
                if (results.size() == 5) {
                    break;
                }
            }
        }
        return results.toArray(new Searchable[0]);
    }
}
