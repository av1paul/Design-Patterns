package org.avi.atm.Withdrawl;

import org.avi.atm.entities.ATM;

public class FiveHundredWithdrawProcessor extends CashWithdrawProcessor {
    public FiveHundredWithdrawProcessor(CashWithdrawProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public void withdraw(ATM atm, int amount) {
        int required = amount / 500;
        int balance = amount % 500;
        if(required <= atm.getNoOfFiveHundredNotes()) {
            atm.deductFiveHundredNotes(required);
        } else {
            int notesInAtm = atm.getNoOfFiveHundredNotes();
            atm.deductFiveHundredNotes(notesInAtm);
            balance += (required - notesInAtm) * 500;
        }
        if(balance != 0) {
            super.withdraw(atm, balance);
        }
    }
}
