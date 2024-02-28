package org.avi.atm.ATMStates;

import org.avi.atm.entities.ATM;
import org.avi.atm.entities.Card;

public class CheckBalanceState extends ATMState {

    @Override
    public void displayBalance(ATM atm, Card card) {
        System.out.println("Your Bank Balance is: " + card.getBalance());
        exit(atm);
    }

    @Override
    public void returnCard() {
        System.out.println("Please collect your card");
    }

    @Override
    public void exit(ATM atm) {
        returnCard();
        atm.setCurrentState(new IdeState());
        System.out.println("Exiting...");
    }
}
