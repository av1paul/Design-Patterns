package org.avi.splitwise.expense.split;

import java.util.List;

public interface ExpenseSplit {
    public void validateSplit(double amount, List<Split> splitDetails) throws Exception;
}
