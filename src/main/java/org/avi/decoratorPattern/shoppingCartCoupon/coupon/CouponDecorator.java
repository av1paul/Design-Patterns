package org.avi.decoratorPattern.shoppingCartCoupon.coupon;

import org.avi.decoratorPattern.shoppingCartCoupon.product.Product;
import org.avi.decoratorPattern.shoppingCartCoupon.product.ProductType;

public abstract class CouponDecorator extends Product {

    protected Product product;

    public CouponDecorator(Product product) {
        this.product = product;
    }
}
