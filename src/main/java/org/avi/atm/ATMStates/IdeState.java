package org.avi.atm.ATMStates;

import org.avi.atm.entities.ATM;
import org.avi.atm.entities.Card;

public class IdeState extends ATMState {

    @Override
    public void insertCard(ATM atm, Card card) {
        System.out.println("Card is inserted");
        atm.setCurrentState(new HasCardState());
    }
}
