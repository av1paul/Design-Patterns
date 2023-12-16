package org.avi.decoratorPattern.shoppingCartCoupon.product;

public class TV extends Product {

    public TV(String name, double price) {
        super(name, price, ProductType.ELECTRONICS);
    }
}
