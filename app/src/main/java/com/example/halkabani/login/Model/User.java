package com.example.halkabani.login.Model;

import android.text.TextUtils;
import android.util.Patterns;

public class User implements IUser {
    private String Email, Password;

    public User (String e, String p){
        Email = e;
        Password = p;
    }
    @Override
    public String getEmail() {
        return Email;
    }

    @Override
    public String getPassword() {
        return Password;
    }

    @Override
    public Boolean isValidData() {
        return !TextUtils.isEmpty(getEmail()) &&
                Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches() &&
                getPassword().length() > 6;
    }

}
