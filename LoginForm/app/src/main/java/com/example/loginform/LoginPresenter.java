package com.example.loginform;

import com.example.loginform.Model.LoginCredentails;
import com.example.loginform.Model.LoginIntractor;

public class LoginPresenter implements Contract.LoginListener {

    private Contract.LoginView loginView;
    private LoginIntractor loginIntractor;
    public LoginPresenter(Contract.LoginView loginView){
        this.loginView = loginView;
        loginIntractor = new LoginIntractor(this);
    }
    public void start(LoginCredentails loginCredentails){
        loginView.showProgressBar();
        loginIntractor.login(loginCredentails);

    }
    @Override
    public void onSuccess() {
        loginView.hideProgressBar();
        loginView.onSuccess();

    }

    @Override
    public void onFailed(String message) {
        loginView.hideProgressBar();
        loginView.onFailed(message);

    }
}
