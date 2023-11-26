package org.avi.decoratorPattern;

public abstract class ToppingDecorator extends BasePizza {

    protected final BasePizza basePizza;

    protected ToppingDecorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
}
