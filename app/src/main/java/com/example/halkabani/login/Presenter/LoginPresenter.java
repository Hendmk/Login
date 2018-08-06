package com.example.halkabani.login.Presenter;

import com.example.halkabani.login.Model.User;
import com.example.halkabani.login.View.ILoginView;

public class LoginPresenter implements ILoginPresenter {
    ILoginView LoginView;

    public LoginPresenter(ILoginView loginView) {
        LoginView = loginView;
    }

    @Override
    public void onLogin(String email, String password) {
        User user = new User(email, password);
        Boolean isSuccess = user.isValidData();

        if(isSuccess){
            LoginView.onLoginResult("Sucess Login");
        } else {
            LoginView.onLoginResult("Login Error");
        }
    }
}
