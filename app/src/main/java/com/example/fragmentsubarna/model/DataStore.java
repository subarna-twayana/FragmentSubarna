package com.example.fragmentsubarna.model;

public class DataStore {
    private String username;
    private String password;
    private String repassword;

    public void DataStore(String username, String password, String repassword) {
        this.username = username;
        this.password = password;
        this.repassword = repassword;
    }

    public String getName() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getRepassword() {
        return repassword;
    }
}
