package org.skypro.skyshop.searchable;

import java.util.ArrayList;
import java.util.List;

public class SearchEngine {
    private List<Searchable> searchables = new ArrayList<>();

    public void add(Searchable searchable) {
        searchables.add(searchable);
    }

    public List<Searchable> search(String searchTerm) {
        List<Searchable> matchingResults = new ArrayList<>();

        for (Searchable searchable : searchables) {
            String searchableTerm = searchable.getSearchTerm();
            int searchLength = searchTerm.length();
            int termLength = searchableTerm.length();

            int start = 0;
            while (true) {
                int index = searchableTerm.indexOf(searchTerm, start);
                if (index == -1) {
                    break;
                }
                if (index + searchLength == termLength) {
                    matchingResults.add(searchable);
                    start = index + 1;
                }
            }
        }

        return matchingResults;
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
}


