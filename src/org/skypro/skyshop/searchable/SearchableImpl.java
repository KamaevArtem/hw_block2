package org.skypro.skyshop.searchable;

public class SearchableImpl implements Searchable {
    private String searchTerm;
    private String contentType;
    private String name;

    public SearchableImpl(String searchTerm, String contentType, String name) {
        this.searchTerm = searchTerm;
        this.contentType = contentType;
        this.name = name;
    }

    @Override
    public String getSearchTerm() {
        return searchTerm;
    }

    @Override
    public String getContentType() {
        return contentType;
    }

    @Override
    public String getName() {
        return name;
    }
}
