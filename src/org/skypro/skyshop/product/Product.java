package org.skypro.skyshop.product;

public abstract class Product {
    protected String name;


    protected Product(String name) {
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
}
