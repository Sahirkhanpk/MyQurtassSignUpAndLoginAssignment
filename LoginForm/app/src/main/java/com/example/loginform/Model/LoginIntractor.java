package com.example.loginform.Model;

import android.os.Handler;
import android.text.TextUtils;
import android.util.Patterns;

import com.example.loginform.Contract;


public class LoginIntractor {
    public LoginIntractor(Contract.LoginListener loginListener) {
        this.loginListener = loginListener;
    }

    private Contract.LoginListener loginListener;


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
            loginListener.onFailed("The Email is Empty");
          return true;
        }
         if(!Patterns.EMAIL_ADDRESS.matcher(username).matches()){
            loginListener.onFailed("The Email is invalid");
            return true;

        }
        if(TextUtils.isEmpty(password)){
            loginListener.onFailed("The Password is Empty");
            return true;
        }
        if(password.length()<5){
            loginListener.onFailed("The Password is weak");
            return true;
        }
        return false;
    }
}
