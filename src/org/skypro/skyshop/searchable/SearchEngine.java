package org.skypro.skyshop.searchable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchEngine {
    private List<Searchable> searchables;

    public SearchEngine() {
        searchables = new ArrayList<>();
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

    public Searchable search(String searchTerm) throws BestResultNotFound {
        Searchable bestMatch = null;
        int maxRepeats = 0;

        for (Searchable searchable : searchables) {
            int repeats = countRepeats(searchable, searchTerm);
            if (repeats > maxRepeats) {
                maxRepeats = repeats;
                bestMatch = searchable;
            }
        }

        if (bestMatch == null) {
            throw new BestResultNotFound("Не найдено подходящего объекта для поиска \"" + searchTerm + "\".");
        }

        return bestMatch;
    }

    private int countRepeats(Searchable searchable, String search) {
        int count = 0;
        String term = searchable.getSearchTerm();
        int searchLength = search.length();
        int termLength = term.length();

        int start = 0;
        while (true) {
            int index = term.indexOf(search, start);
            if (index == -1) {
                break;
            }
            count++;
            start = index + searchLength;
        }

        return count;
    }
    class BestResultNotFound extends Exception {
        public BestResultNotFound(String message) {
            super(message);
        }
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


