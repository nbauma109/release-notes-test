package com.example;

public class Auth {
    public boolean authenticate(String user, String password) {
        if (user == null || password == null || password.isEmpty()) {
            return false;
        }
        return user.equals("admin") && password.equals("secret");
    }
}
