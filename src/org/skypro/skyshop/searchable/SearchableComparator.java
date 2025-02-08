package org.skypro.skyshop.searchable;

import java.util.Comparator;

public class SearchableComparator implements Comparator<Searchable> {
    @Override
    public int compare(Searchable o1, Searchable o2) {
        String name1 = o1.getName();
        String name2 = o2.getName();
        int lengthComparison = Integer.compare(name1.length(), name2.length());

        if (lengthComparison != 0) {
            return lengthComparison;
        }

        return name1.compareTo(name2);
    }
}