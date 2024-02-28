package org.avi.atm.Withdrawl;

import org.avi.atm.entities.ATM;

public class OneHundredWithdrawProcessor extends CashWithdrawProcessor{
    public OneHundredWithdrawProcessor(CashWithdrawProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public void withdraw(ATM atm, int amount) {
        int required = amount / 100;
        int balance = amount % 100;

        if(required <= atm.getNoOfTwoThousandNotes()) {
            atm.deductTwoThousandNotes(required);
        } else {
            int notesInAtm = atm.getNoOfTwoThousandNotes();
            atm.deductTwoThousandNotes(notesInAtm);
            balance += (required - notesInAtm) * 100;
        }
        if(balance != 0) {
            super.withdraw(atm, balance);
        }
    }
}
