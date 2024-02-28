package org.avi.atm.entities;

public class Card {
    private int cardNumber;
    private int cvv;
    private int expiryDate;
    private int holderName;
    private final int pin = 111111;
    private Account account;

    public boolean isCorrectPIN(int pin) {
        return (pin == this.pin);
    }

    public int getBalance() {
        return account.getBalance();
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void deductBalance(int amount) {
        account.withdrawBalance(amount);
    }
}
