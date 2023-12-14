package org.avi.compositePattern.calculator;

public class Expression implements ArithmeticExpression {

    private ArithmeticExpression leftExpression;
    private ArithmeticExpression rightExpression;
    private Operator operator;

    public Expression(ArithmeticExpression leftExpression, ArithmeticExpression rightExpression, Operator operator) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operator = operator;
    }

    @Override
    public int evaluate() {
        switch (operator) {
            case ADD:
                return leftExpression.evaluate() + rightExpression.evaluate();
            case SUBTRACT:
                return leftExpression.evaluate() - rightExpression.evaluate();
            case MULTIPLY:
                return leftExpression.evaluate() * rightExpression.evaluate();
            case DIVISION:
                return leftExpression.evaluate() / rightExpression.evaluate();
        }
        return 0;
    }
}
