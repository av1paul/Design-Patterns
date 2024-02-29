package org.avi.splitwise.expense;

import org.avi.splitwise.expense.balance.Balance;
import org.avi.splitwise.expense.balance.BalanceController;
import org.avi.splitwise.expense.split.ExpenseSplit;
import org.avi.splitwise.expense.split.ExpenseSplitFactory;
import org.avi.splitwise.expense.split.Split;
import org.avi.splitwise.user.User;

import java.util.List;

public class ExpenseController {

    private final BalanceController balanceController;

    public ExpenseController() {
        this.balanceController = new BalanceController();
    }

    public Expense createExpense(String expenseId, String description, User paidByUser,
                                 double amount, ExpenseSplitType expenseSplitType, List<Split> splitDetails) throws Exception {

        ExpenseSplit expenseSplit = ExpenseSplitFactory.getExpenseSplitObj(expenseSplitType);
        expenseSplit.validateSplit(amount, splitDetails);
        Expense expense = new Expense(expenseId, description, paidByUser, amount, expenseSplitType, splitDetails);
        balanceController.updateUserExpenseBalanceSheet(paidByUser, splitDetails, amount);
        return expense;
    }
}