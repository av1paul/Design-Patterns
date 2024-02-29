package org.avi.splitwise.expense.balance;

import org.avi.splitwise.expense.split.Split;
import org.avi.splitwise.user.User;
import org.avi.splitwise.user.UserExpenseBalanceSheet;

import java.util.List;
import java.util.Map;

public class BalanceController {

    public void updateUserExpenseBalanceSheet(User paidByUser, List<Split> splitDetails, double amount) {
        UserExpenseBalanceSheet paidByUserSheet = paidByUser.getUserExpenseBalanceSheet();
        paidByUserSheet.setTotalPayment(paidByUserSheet.getTotalPayment() + amount);

        for(Split split : splitDetails) {
            User userOwed = split.getUser();
            double splitAmount = split.getAmount();

            UserExpenseBalanceSheet userOwedBalanceSheet = userOwed.getUserExpenseBalanceSheet();
            userOwedBalanceSheet.setTotalExpense(userOwedBalanceSheet.getTotalExpense() + splitAmount);

            if(!paidByUser.getUserId().equals(userOwed.getUserId())) {
                paidByUserSheet.setTotalGetBack(paidByUserSheet.getTotalGetBack() + splitAmount);
                userOwedBalanceSheet.setTotalOwe(userOwedBalanceSheet.getTotalOwe() + splitAmount);

                if(!paidByUserSheet.getFriendBalance().containsKey(userOwed)) {
                    paidByUserSheet.getFriendBalance().put(userOwed, new Balance());
                }

                Balance userOwedBalance = paidByUser.getUserExpenseBalanceSheet().getFriendBalance().get(userOwed);
                userOwedBalance.setAmountGetBack(userOwedBalance.getAmountGetBack() + splitAmount);

                if(!userOwedBalanceSheet.getFriendBalance().containsKey(paidByUser)) {
                    userOwedBalanceSheet.getFriendBalance().put(paidByUser, new Balance());
                }

                Balance paidUserBalance = userOwed.getUserExpenseBalanceSheet().getFriendBalance().get(paidByUser);
                paidUserBalance.setAmountOwed(paidUserBalance.getAmountOwed() + splitAmount);
            }
        }
    }

    public void showBalanceSheetOfUser(User user){

        System.out.println("---------------------------------------");

        System.out.println("Balance sheet of user : " + user.getUserId());

        UserExpenseBalanceSheet userExpenseBalanceSheet =  user.getUserExpenseBalanceSheet();

        System.out.println("TotalYourExpense: " + userExpenseBalanceSheet.getTotalExpense());
        System.out.println("TotalGetBack: " + userExpenseBalanceSheet.getTotalGetBack());
        System.out.println("TotalYourOwe: " + userExpenseBalanceSheet.getTotalOwe());
        System.out.println("TotalPaymnetMade: " + userExpenseBalanceSheet.getTotalPayment());
        for(Map.Entry<User, Balance> entry : userExpenseBalanceSheet.getFriendBalance().entrySet()){

            String userID = entry.getKey().getUserId();
            Balance balance = entry.getValue();

            System.out.println("userID:" + userID + " YouGetBack:" + balance.getAmountGetBack() + " YouOwe:" + balance.getAmountGetBack());
        }

        System.out.println("---------------------------------------");

    }
}
