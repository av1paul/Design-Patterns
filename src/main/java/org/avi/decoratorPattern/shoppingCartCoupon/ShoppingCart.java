package org.avi.decoratorPattern.shoppingCartCoupon;

import org.avi.decoratorPattern.shoppingCartCoupon.coupon.ElectronicDiscountDecorator;
import org.avi.decoratorPattern.shoppingCartCoupon.coupon.PerentageCouponDecorator;
import org.avi.decoratorPattern.shoppingCartCoupon.product.Product;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> products;

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    public void addToCart(Product product) {
        products.add(
                new PerentageCouponDecorator(
                        new ElectronicDiscountDecorator(product, 10),
                        10));
    }

    public double getTotalPrice() {
        double price = 0;
        for(Product product : products) {
            price += product.getPrice();
        }
        return price;
    }
}
