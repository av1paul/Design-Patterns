package org.avi.atm.ATMStates;

import org.avi.atm.entities.ATM;
import org.avi.atm.entities.Card;
import org.avi.atm.entities.TransactionType;

public abstract class ATMState {

    public void insertCard(ATM atm, Card card) {
        System.out.println("OOPS!! Something went wrong");
    }

    public void authenticatePin(ATM atm, Card card, int pin) {
        System.out.println("OOPS!! Something went wrong");
    }

    public void selectTransactionType(ATM atm, Card card, TransactionType type) {
        System.out.println("OOPS!! Something went wrong");
    }

    public void withdrawAmount(ATM atm, Card card, int amount) {
        System.out.println("OOPS!! Something went wrong");
    }

    public void displayBalance(ATM atm, Card card) {
        System.out.println("OOPS!! Something went wrong");
    }

    public void returnCard() {
        System.out.println("OOPS!! Something went wrong");
    }

    public void exit(ATM atm) {
        System.out.println("OOPS!! Something went wrong");
    }
}
