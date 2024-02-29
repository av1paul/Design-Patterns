package org.avi.splitwise.expense;

import org.avi.splitwise.expense.split.Split;
import org.avi.splitwise.user.User;

import java.util.List;

public class Expense {
    private String expenseId;
    private String description;
    private User paidByUser;
    private double amount;
    private ExpenseSplitType expenseSplitType;
    private List<Split> splitDetails;

    public Expense(String expenseId, String description, User paidByUser, double amount, ExpenseSplitType expenseSplitType, List<Split> splitDetails) {
        this.expenseId = expenseId;
        this.description = description;
        this.paidByUser = paidByUser;
        this.amount = amount;
        this.expenseSplitType = expenseSplitType;
        this.splitDetails = splitDetails;
    }

    public String getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(String expenseId) {
        this.expenseId = expenseId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getPaidByUser() {
        return paidByUser;
    }

    public void setPaidByUser(User paidByUser) {
        this.paidByUser = paidByUser;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public ExpenseSplitType getExpenseSplitType() {
        return expenseSplitType;
    }

    public void setExpenseSplitType(ExpenseSplitType expenseSplitType) {
        this.expenseSplitType = expenseSplitType;
    }

    public List<Split> getSplitDetails() {
        return splitDetails;
    }

    public void setSplitDetails(List<Split> splitDetails) {
        this.splitDetails = splitDetails;
    }
}
