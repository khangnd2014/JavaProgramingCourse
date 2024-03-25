package com.example.jstldemo.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDB {
    private static UserDB instance = new UserDB();
    Map<String, User> userMap = new HashMap<>();

    public UserDB() {
        // init users
        addUser("Khang", "11111");
        addUser("Thinh", "222222");
        addUser("Nguyen", "33333");
        addUser("Hoang", "444444");
        addUser("Don", "555555");
    }

    private void addUser(String name, String phone) {
        userMap.put(name, new User(name, phone));
    }

    public static UserDB getInstance() {
        return instance;
    }

    public User getUser(String userId) {
        return userMap.get(userId);
    }

    public List<User> getAllUsers() {
        return (List<User>) userMap.values();
    }
}
