package com.example.loginform.View;

import androidx.appcompat.app.AppCompatActivity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.example.loginform.Contract;
import com.example.loginform.LoginPresenter;
import com.example.loginform.Model.LoginCredentails;
import com.example.loginform.R;

public class MainActivity extends AppCompatActivity implements Contract.LoginView{
    private ProgressDialog progressDialog;
    private LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressDialog = new ProgressDialog(this);
        loginPresenter = new LoginPresenter(this);
        final EditText EmailView = findViewById(R.id.etUserName);
        final EditText passView = findViewById(R.id.etPass);
        Button LoginButton = findViewById(R.id.btnSignIn);
        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Email = EmailView.getText().toString();
                String Pass = passView.getText().toString();
                LoginCredentails loginCredentails =new LoginCredentails(Email,Pass);
                loginPresenter.start(loginCredentails);
            }
        });
    }

    @Override
    public void showProgressBar() {
        progressDialog.show();

    }

    @Override
    public void hideProgressBar() {
        progressDialog.hide();

    }

    @Override
    public void onSuccess() {
        startActivity(new Intent(this,SuccessfullyLogedin.class));

    }

    @Override
    public void onFailed(String message) {
        Toast.makeText(this,message,Toast.LENGTH_LONG);

    }
}
