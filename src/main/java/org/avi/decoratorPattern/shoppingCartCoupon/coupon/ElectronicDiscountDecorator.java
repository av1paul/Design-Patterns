package org.avi.decoratorPattern.shoppingCartCoupon.coupon;

import org.avi.decoratorPattern.shoppingCartCoupon.product.Product;
import org.avi.decoratorPattern.shoppingCartCoupon.product.ProductType;

public class ElectronicDiscountDecorator extends CouponDecorator {
    private double discountPercentage;

    public ElectronicDiscountDecorator(Product product, double discountPercentage) {
        super(product);
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double getPrice() {
        if(product.getType().equals(ProductType.ELECTRONICS)) {
            return (100.0 - discountPercentage) * product.getPrice() / 100.0;
        }
        return product.getPrice();
    }
}
