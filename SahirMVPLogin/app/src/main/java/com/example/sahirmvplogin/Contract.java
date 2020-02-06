package com.example.sahirmvplogin;

public interface Contract {
    interface loginView{
        void onSuccess();
        void onFailer(String message);
        void showProgressDaillog();
        void hideProgressDaillog();
    }
    interface loginLisener{
        void onSuccess();
        void onFailer(String message);

    }
}
