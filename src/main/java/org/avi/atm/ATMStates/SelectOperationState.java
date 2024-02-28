package org.avi.atm.ATMStates;

import org.avi.atm.entities.ATM;
import org.avi.atm.entities.Card;
import org.avi.atm.entities.TransactionType;

public class SelectOperationState extends ATMState {

    public SelectOperationState() {

    }

    @Override
    public void selectTransactionType(ATM atm, Card card, TransactionType type) {
        switch (type) {
            case BALANCE_CHECK:
                atm.setCurrentState(new CheckBalanceState());
                break;
            case CASH_WITHDRAWAL:
                atm.setCurrentState(new CashWithdrawState());
                break;
            default:
                System.out.println("Invalid Option");
                exit(atm);
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
