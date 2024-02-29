package org.avi.splitwise.expense.split;

import java.util.List;

public class EqualExpenseSplit implements ExpenseSplit {
    @Override
    public void validateSplit(double amount, List<Split> splitDetails) throws Exception {
        double individualAmount = amount / splitDetails.size();
        for(Split split : splitDetails) {
            if(Double.compare(split.getAmount(), individualAmount) != 0) {
                throw new Exception("Invalid Split");
            }
        }
    }
}
