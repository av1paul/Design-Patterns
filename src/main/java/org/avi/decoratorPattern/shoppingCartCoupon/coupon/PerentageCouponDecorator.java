package org.avi.decoratorPattern.shoppingCartCoupon.coupon;

import org.avi.decoratorPattern.shoppingCartCoupon.product.Product;

public class PerentageCouponDecorator extends CouponDecorator {

    private Product product;
    private double discountPercentage;

    public PerentageCouponDecorator(Product product, double discountPercentage) {
        this.product = product;
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double getPrice() {
        return (100.0 - discountPercentage) * product.getPrice() / 100.0;
    }
}
