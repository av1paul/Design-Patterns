package org.avi.splitwise.user;

import java.util.ArrayList;
import java.util.List;

public class UserController {
    private final List<User> userList;

    public UserController() {
        userList = new ArrayList<>();
    }

    public void addUser(User user) {
        userList.add(user);
    }

    public User getUser(String userId) throws Exception {
        for (User user : userList) {
            if (user.getUserId().equals(userId)) {
                return user;
            }
        }
        throw new Exception("User Not Found");
    }

    public List<User> getAllUsers() {
        return userList;
    }
}
