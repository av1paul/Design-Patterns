package org.avi.splitwise.expense.split;

import org.avi.splitwise.expense.ExpenseSplitType;

public class ExpenseSplitFactory {
    public static ExpenseSplit getExpenseSplitObj(ExpenseSplitType type) throws Exception {
        switch (type) {
            case EQUAL -> {
                return new EqualExpenseSplit();
            }
            case UNEQUAL -> {
                return new UnequalExpenseSplit();
            }
            case PERCENTAGE -> {
                return new PercentageExpenseSplit();
            }
            default -> {
                throw new Exception("Invalid Expense Type");
            }
        }
    }
}
