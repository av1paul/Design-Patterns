package org.avi.decoratorPattern.shoppingCartCoupon.product;

public class Pen extends Product {

    public Pen(String name, double price) {
        super(name, price, ProductType.STATIONARY);
    }
}
