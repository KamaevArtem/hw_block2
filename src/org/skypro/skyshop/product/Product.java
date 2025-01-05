package org.skypro.skyshop.product;

import org.skypro.skyshop.searchable.Searchable;

public abstract class Product implements Searchable {
    protected String name;

    @Override
    public String getSearchTerm() {
        return getName();
    }

    @Override
    public String getContentType() {
        return "Product";
    }

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public abstract int getPrice();

    public abstract boolean isSpecial();


    @Override
    public String toString() {
        return getName() + (isSpecial() ? " (" + getPrice() + " скидка)" : ": Цена " + getPrice());
    }

    @Override
    public String getStringRepresentation() {
        return getName() + " - " + getContentType();
    }
}
