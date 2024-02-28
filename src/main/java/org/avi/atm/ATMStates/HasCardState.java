package org.avi.atm.ATMStates;

import org.avi.atm.entities.ATM;
import org.avi.atm.entities.Card;

public class HasCardState extends ATMState {

    public HasCardState() {
        System.out.println("Please enter PIN");
    }

    @Override
    public void authenticatePin(ATM atm, Card card, int pin) {
        boolean isCorrectPin = card.isCorrectPIN(pin);
        if(isCorrectPin) {
            atm.setCurrentState(new SelectOperationState());
        } else {
            System.out.println("Invalid PIN");
        }
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
