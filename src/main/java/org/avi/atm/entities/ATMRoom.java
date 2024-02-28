package org.avi.atm.entities;

import java.util.Scanner;

public class ATMRoom {

    private ATM atm;
    private User user;

    public static void main(String[] args) {
        ATMRoom atmRoom = new ATMRoom();
        atmRoom.intialize();
        Scanner in = new Scanner(System.in);

        atmRoom.atm.printCurrentATMStatus();
        atmRoom.atm.getCurrentState().insertCard(atmRoom.atm, atmRoom.user.getCard());
        int pin = in.nextInt();
        atmRoom.atm.getCurrentState().authenticatePin(atmRoom.atm, atmRoom.user.getCard(), pin);
        atmRoom.atm.getCurrentState().selectTransactionType(atmRoom.atm, atmRoom.user.getCard(), TransactionType.CASH_WITHDRAWAL);
        int amount = in.nextInt();
        atmRoom.atm.getCurrentState().withdrawAmount(atmRoom.atm, atmRoom.user.getCard(), amount);
        atmRoom.atm.printCurrentATMStatus();
    }

    private void intialize() {
        atm = ATM.getAtmObj();
        atm.setAtmBalance(5500, 1, 2, 5);
        user = createUser();
    }

    private User createUser() {
        User user = new User();
        user.setCard(createCard());
        return user;
    }

    private Card createCard() {
        Card card = new Card();
        card.setAccount(createAccount());
        return card;
    }

    private Account createAccount() {
        Account account = new Account();
        account.setBalance(3000);
        return account;
    }


}
