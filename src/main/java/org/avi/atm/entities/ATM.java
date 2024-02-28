package org.avi.atm.entities;

import org.avi.atm.ATMStates.ATMState;
import org.avi.atm.ATMStates.IdeState;

public class ATM {
    private static ATM atmObj = new ATM();
    private ATMState currentState;
    private int atmBalance;
    private int noOfTwoThousandNotes;
    private int noOfFiveHundredNotes;
    private int noOfOneHundredNotes;

    private ATM() {
    }

    public static ATM getAtmObj() {
        atmObj.setCurrentState(new IdeState());
        return atmObj;
    }

    public ATMState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(ATMState currentState) {
        this.currentState = currentState;
    }

    public int getAtmBalance() {
        return atmBalance;
    }

    public void deductBalance(int amount) {
        this.atmBalance -= amount;
    }

    public void setAtmBalance(int atmBalance, int noOfTwoThousandNotes, int noOfFiveHundredNotes, int noOfOneHundredNotes) {
        this.atmBalance = atmBalance;
        this.noOfTwoThousandNotes = noOfTwoThousandNotes;
        this.noOfFiveHundredNotes = noOfFiveHundredNotes;
        this.noOfOneHundredNotes = noOfOneHundredNotes;
    }

    public int getNoOfTwoThousandNotes() {
        return noOfTwoThousandNotes;
    }

    public int getNoOfFiveHundredNotes() {
        return noOfFiveHundredNotes;
    }

    public int getNoOfOneHundredNotes() {
        return noOfOneHundredNotes;
    }

    public void deductTwoThousandNotes(int number) {
        this.noOfTwoThousandNotes -= number;
    }

    public void deductFiveHundredNotes(int number) {
        this.noOfFiveHundredNotes-= number;
    }

    public void deductOneHundredNotes(int number) {
        this.noOfOneHundredNotes-= number;
    }

    public void printCurrentATMStatus(){
        System.out.println("Balance: " + atmBalance);
        System.out.println("2kNotes: " + noOfTwoThousandNotes);
        System.out.println("500Notes: " + noOfFiveHundredNotes);
        System.out.println("100Notes: " + noOfOneHundredNotes);
    }
}
