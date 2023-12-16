package org.avi.decoratorPattern.shoppingCartCoupon.product;

public abstract class Product {
    protected String name;
    protected double price;
    protected ProductType type;

    public Product() {
    }

    public Product(String name, double price, ProductType type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public ProductType getType() {
        return type;
    }
}
