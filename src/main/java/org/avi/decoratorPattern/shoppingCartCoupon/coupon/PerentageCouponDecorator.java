package org.avi.decoratorPattern.shoppingCartCoupon.coupon;

import org.avi.decoratorPattern.shoppingCartCoupon.product.Product;

public class PerentageCouponDecorator extends CouponDecorator {

    private double discountPercentage;

    public PerentageCouponDecorator(Product product, double discountPercentage) {
        super(product);
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double getPrice() {
        return (100.0 - discountPercentage) * product.getPrice() / 100.0;
    }
}
