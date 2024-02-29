package org.avi.splitwise.group;

import org.avi.splitwise.expense.Expense;
import org.avi.splitwise.expense.ExpenseController;
import org.avi.splitwise.expense.ExpenseSplitType;
import org.avi.splitwise.expense.split.Split;
import org.avi.splitwise.user.User;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String groupId;
    private String groupName;
    private final List<User> groupMembers;
    private final List<Expense> expenseList;
    private final ExpenseController expenseController;

    public Group() {
        this.groupMembers = new ArrayList<>();
        this.expenseList = new ArrayList<>();
        this.expenseController = new ExpenseController();
    }


    public String getGroupId() {
        return groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public List<User> getGroupMembers() {
        return groupMembers;
    }

    public List<Expense> getExpenseList() {
        return expenseList;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void addMember(User user) {
        groupMembers.add(user);
    }

    public Expense createExpense(String expenseId, String description, User paidByUser,
                                 double amount, ExpenseSplitType expenseSplitType,
                                 List<Split> splitDetails) throws Exception {
        Expense expense = expenseController.createExpense(expenseId, description, paidByUser, amount,
                expenseSplitType, splitDetails);
        expenseList.add(expense);
        return expense;
    }
}
