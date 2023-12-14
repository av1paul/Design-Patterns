package org.avi.compositePattern.calculator;

public class Number implements ArithmeticExpression {

    private int val;

    public Number(int val) {
        this.val = val;
    }

    @Override
    public int evaluate() {
        return val;
    }
}
