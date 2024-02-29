package org.avi.splitwise;

import org.avi.splitwise.expense.ExpenseSplitType;
import org.avi.splitwise.expense.balance.BalanceController;
import org.avi.splitwise.expense.split.Split;
import org.avi.splitwise.group.Group;
import org.avi.splitwise.group.GroupController;
import org.avi.splitwise.user.User;
import org.avi.splitwise.user.UserController;

import java.util.ArrayList;
import java.util.List;

public class SplitWise {
    private final UserController userController;
    private final GroupController groupController;
    private final BalanceController balanceController;

    public SplitWise() {
        this.userController = new UserController();
        this.groupController = new GroupController();
        this.balanceController = new BalanceController();
    }

    public void demo() throws Exception {
        setupUserAndGroup();

    }

    public void setupUserAndGroup() throws Exception {
        addUsersToSplitWiseApp();
        User user1 = userController.getUser("U1001");
        groupController.createNewGroup("G1001", "Outing with Friends", user1);
        Group group = groupController.getGroup("G1001");
        group.addMember(userController.getUser("U2001"));
        group.addMember(userController.getUser("U3001"));

        List<Split> splits = new ArrayList<>();
        Split split1 = new Split(userController.getUser("U1001"), 300);
        Split split2 = new Split(userController.getUser("U2001"), 300);
        Split split3 = new Split(userController.getUser("U3001"), 300);
        splits.add(split1);
        splits.add(split2);
        splits.add(split3);
        group.createExpense("Exp1001", "Breakfast", userController.getUser("U1001"), 900, ExpenseSplitType.EQUAL, splits);

        List<Split> splits2 = new ArrayList<>();
        Split splits2_1 = new Split(userController.getUser("U1001"), 400);
        Split splits2_2 = new Split(userController.getUser("U2001"), 100);
        splits2.add(splits2_1);
        splits2.add(splits2_2);
        group.createExpense("Exp1002", "Lunch", userController.getUser("U2001"), 500, ExpenseSplitType.UNEQUAL, splits2);

        for(User user : userController.getAllUsers()) {
            balanceController.showBalanceSheetOfUser(user);
        }
    }

    private void addUsersToSplitWiseApp(){

        User user1 = new User("U1001", "User1");
        User user2 = new User ("U2001", "User2");
        User user3 = new User ("U3001", "User3");
        userController.addUser(user1);
        userController.addUser(user2);
        userController.addUser(user3);
    }
}
