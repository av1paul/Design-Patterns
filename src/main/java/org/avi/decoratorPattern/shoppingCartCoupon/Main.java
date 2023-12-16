package org.avi.decoratorPattern.shoppingCartCoupon;

import org.avi.decoratorPattern.shoppingCartCoupon.product.Pen;
import org.avi.decoratorPattern.shoppingCartCoupon.product.Product;
import org.avi.decoratorPattern.shoppingCartCoupon.product.TV;

public class Main {
    public static void main(String[] args) {
        Product pen = new Pen("Nataraja", 100);
        Product tv = new TV("Sony", 1000);
        ShoppingCart cart = new ShoppingCart();
        cart.addToCart(pen);
        cart.addToCart(tv);
        System.out.println(cart.getTotalPrice());
    }
}
