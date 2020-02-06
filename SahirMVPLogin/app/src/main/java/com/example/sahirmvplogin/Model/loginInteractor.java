package com.example.sahirmvplogin.Model;

import android.os.Handler;
import android.text.TextUtils;
import android.util.Patterns;

import com.example.sahirmvplogin.Contract;

public class loginInteractor {
    private Contract.loginLisener  loginListener;

    public loginInteractor(Contract.loginLisener loginLisener)
    {
        this.loginListener = loginLisener;
    }

    public void login(final LoginCredentails loginCredentails)
    {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if(hasError(loginCredentails)){
                    return;
                }
                loginListener.onSuccess();

            }
        },3000);


    }




    public boolean hasError(LoginCredentails loginCredentails){
        String username = loginCredentails.getUsername();
        String password = loginCredentails.getPassword();
        if(TextUtils.isEmpty(username)){
            loginListener.onFailer("The Email is Empty");
            return true;
        }
        if(!Patterns.EMAIL_ADDRESS.matcher(username).matches()){
            loginListener.onFailer("The Email is invalid");
            return true;

        }
        if(TextUtils.isEmpty(password)){
            loginListener.onFailer("The Password is Empty");
            return true;
        }
        if(password.length()<5){
            loginListener.onFailer("The Password is weak");
            return true;
        }
        return false;
    }

}
