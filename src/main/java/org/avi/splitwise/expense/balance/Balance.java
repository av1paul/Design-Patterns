package org.avi.splitwise.expense.balance;

public class Balance {
    private double amountOwed;
    private double amountGetBack;

    public Balance() {
        this.amountOwed = 0;
        this.amountGetBack = 0;
    }

    public double getAmountOwed() {
        return amountOwed;
    }

    public void setAmountOwed(double amountOwed) {
        this.amountOwed = amountOwed;
    }

    public double getAmountGetBack() {
        return amountGetBack;
    }

    public void setAmountGetBack(double amountGetBack) {
        this.amountGetBack = amountGetBack;
    }
}
