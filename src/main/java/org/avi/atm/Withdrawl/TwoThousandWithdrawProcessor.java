package org.avi.atm.Withdrawl;

import org.avi.atm.entities.ATM;

public class TwoThousandWithdrawProcessor extends CashWithdrawProcessor{
    public TwoThousandWithdrawProcessor(CashWithdrawProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public void withdraw(ATM atm, int amount) {
        int required = amount / 2000;
        int balance = amount % 2000;

        if(required <= atm.getNoOfTwoThousandNotes()) {
            atm.deductTwoThousandNotes(required);
        } else {
            int notesInAtm = atm.getNoOfTwoThousandNotes();
            atm.deductTwoThousandNotes(notesInAtm);
            balance += (required - notesInAtm) * 2000;
        }
        if(balance != 0) {
            super.withdraw(atm, balance);
        }
    }
}
