package com.example.fragmentsubarna.controller;

import com.example.fragmentsubarna.model.DataStore;

public interface Interface {
    boolean addUser(DataStore data);
    boolean checkUser(String username, String password);
}
