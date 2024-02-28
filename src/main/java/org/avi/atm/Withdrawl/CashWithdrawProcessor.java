package org.avi.atm.Withdrawl;

import org.avi.atm.entities.ATM;

public abstract class CashWithdrawProcessor {
    private final CashWithdrawProcessor nextProcessor;

    public CashWithdrawProcessor(CashWithdrawProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    public void withdraw(ATM atm, int amount) {
        if(nextProcessor != null) {
            nextProcessor.withdraw(atm, amount);
        }
    }
}
