package org.avi.decoratorPattern;

public class ExtraCheese extends ToppingDecorator {
    protected ExtraCheese(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public int getCost() {
        return basePizza.getCost() + 10;
    }
}
