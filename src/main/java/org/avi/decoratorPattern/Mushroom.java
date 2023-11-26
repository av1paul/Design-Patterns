package org.avi.decoratorPattern;

public class Mushroom extends ToppingDecorator {
    protected Mushroom(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public int getCost() {
        return basePizza.getCost() + 15;
    }
}
