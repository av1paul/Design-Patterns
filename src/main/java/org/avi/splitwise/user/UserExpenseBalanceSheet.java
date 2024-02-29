package org.avi.splitwise.user;

import org.avi.splitwise.expense.balance.Balance;

import java.util.HashMap;
import java.util.Map;

public class UserExpenseBalanceSheet {
    private Map<User, Balance> friendBalance;
    private double totalPayment;
    private double totalOwe;
    private double totalGetBack;
    private double totalExpense;

    public UserExpenseBalanceSheet() {
        this.friendBalance = new HashMap<>();
        this.totalOwe = 0;
        this.totalGetBack = 0;
        this.totalExpense = 0;
    }

    public Map<User, Balance> getFriendBalance() {
        return friendBalance;
    }

    public double getTotalOwe() {
        return totalOwe;
    }

    public void setTotalOwe(double totalOwe) {
        this.totalOwe = totalOwe;
    }

    public double getTotalGetBack() {
        return totalGetBack;
    }

    public void setTotalGetBack(double totalGetBack) {
        this.totalGetBack = totalGetBack;
    }

    public double getTotalExpense() {
        return totalExpense;
    }

    public void setTotalExpense(double totalExpense) {
        this.totalExpense = totalExpense;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }
}
