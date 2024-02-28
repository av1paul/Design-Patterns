package org.avi.atm.ATMStates;

import org.avi.atm.Withdrawl.CashWithdrawProcessor;
import org.avi.atm.Withdrawl.FiveHundredWithdrawProcessor;
import org.avi.atm.Withdrawl.OneHundredWithdrawProcessor;
import org.avi.atm.Withdrawl.TwoThousandWithdrawProcessor;
import org.avi.atm.entities.ATM;
import org.avi.atm.entities.Card;

public class CashWithdrawState extends ATMState {

    public CashWithdrawState() {
        System.out.println("Please enter amount");
    }

    @Override
    public void withdrawAmount(ATM atm, Card card, int amount) {
        if(atm.getAtmBalance() < amount) {
            System.out.println("Insufficient fund in the ATM Machine");
            exit(atm);
        } else if(card.getBalance() < amount) {
            System.out.println("Insufficient fund in your Bank Account");
            exit(atm);
        } else {
            card.deductBalance(amount);
            atm.deductBalance(amount);
            CashWithdrawProcessor cashWithdrawProcessor = new TwoThousandWithdrawProcessor(
                    new FiveHundredWithdrawProcessor(new OneHundredWithdrawProcessor(null)));
            cashWithdrawProcessor.withdraw(atm, amount);
        }
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
