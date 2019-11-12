package com.example.fragmentsubarna.controller;


import com.example.fragmentsubarna.model.DataStore;

public class InterfaceImplement implements Interface{
    static String iname, ipassword;
    @Override
    public boolean addUser(DataStore data) {
        boolean result=false;
        if (data.getPassword().equals(data.getRepassword())){
            iname=data.getName();
            ipassword=data.getRepassword();
            result =true;
        }else{
            result=false;
        }
        return result;
    }

    @Override
    public boolean checkUser(String username, String password) {
        boolean result=false;
        if ((username.equals(iname))&&(password.equals(ipassword))){
            result=true;
        }else {
            result=false;
        }
        return result;
    }
}
