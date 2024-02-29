package org.avi.splitwise.expense.split;

import java.util.List;

public class UnequalExpenseSplit implements ExpenseSplit {
    @Override
    public void validateSplit(double amount, List<Split> splitDetails) throws Exception {
        double splitAmount = 0;
        for(Split split : splitDetails) {
            splitAmount += split.getAmount();
        }
        if(splitAmount != amount) {
            throw new Exception("Invalid Split");
        }
    }
}
