package org.skypro.skyshop;

import org.skypro.skyshop.searchable.Searchable;

public class Article implements Searchable {
    private final String articleName;
    private final String articleText;

    public Article(String articleName, String articleText) {
        this.articleName = articleName;
        this.articleText = articleText;
    }

    @Override
    public String getSearchTerm() {
        return articleName +" "+ articleText;
    }

    @Override
    public String getContentType() {
        return "ARTICLE";
    }

    @Override
    public String getName() {
        return articleName;
    }

    @Override
    public String toString() {
        return articleName + "\n" + articleText;
    }
}
