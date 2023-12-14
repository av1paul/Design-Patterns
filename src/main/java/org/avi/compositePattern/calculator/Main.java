package org.avi.compositePattern.calculator;

public class Main {
    /*
    *                   +
    *                /     \
    *               2       *
    *                     /    \
    *                    7      10
    */
    public static void main(String[] args) {
        ArithmeticExpression two = new Number(2);
        ArithmeticExpression seven = new Number(7);
        ArithmeticExpression ten = new Number(10);
        ArithmeticExpression multiply = new Expression(seven, ten, Operator.MULTIPLY);
        ArithmeticExpression add = new Expression(two, multiply, Operator.ADD);

        System.out.println(add.evaluate());

    }
}
