package com.example.loginform;

public interface Contract {
    interface LoginView{

        void showProgressBar();
        void hideProgressBar ();
        void  onSuccess();
        void onFailed(String message);

    }
    interface LoginListener{

        void  onSuccess();
        void onFailed(String message);

    }
}
