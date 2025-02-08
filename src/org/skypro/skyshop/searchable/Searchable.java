package org.skypro.skyshop.searchable;

public interface Searchable {
    String getSearchTerm();
    String getContentType();
    int getPrice();
    boolean isSpecial();
    String getName();
}
