package com.example.myqurtasssignupandloginassignment.View;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myqurtasssignupandloginassignment.DatabaseHelper;
import com.example.myqurtasssignupandloginassignment.Model.signUpModel;
import com.example.myqurtasssignupandloginassignment.R;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class LoginActivity extends AppCompatActivity {
    private EditText etEmail, etPassword;
    private Button btnLogin;
    private TextView tvSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.qurtass_layout_login);

        initialize();
    }


    public void initialize() {
        etEmail = (EditText) findViewById(R.id.etEmail);
        etPassword =(EditText) findViewById(R.id.etPassword);
        btnLogin =(Button) findViewById(R.id.btnLogin);
        tvSignUp = (TextView) findViewById(R.id.tvsignUp);
        tvSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String Email = etEmail.getText().toString();
                String Password = etPassword.getText().toString();
                if (Password.equals("")) {
                    etPassword.setError("Enter Password");
                } else if (Email.equals("") || !Email.matches("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"
                )) {
                    etEmail.setError("Enter A Valid Email Address");
                } else {

                    List<signUpModel> Accounts = new ArrayList<>();
                    DatabaseHelper databaseHelper = new DatabaseHelper(LoginActivity.this);
                    Gson gson = new Gson();

                    List<String> Accountstings = databaseHelper.getAllAccount();

                    Type listType = new TypeToken<signUpModel>() {
                    }.getType();


                    for (int i = 0; i < Accountstings.size(); i++) {

                        signUpModel signUpModel1 = gson.fromJson(Accountstings.get(i), listType);
                        Accounts.add(signUpModel1);
                    }

                    for (
                            int i = 0; i < Accounts.size(); i++) {

                        String VEmail = Accounts.get(i).getEmail();
                        String VPass = Accounts.get(i).getPassword();
                        if (VEmail.equals(Email) && VPass.equals(Password)) {

                            Toast.makeText(LoginActivity.this, "login Successful", Toast.LENGTH_LONG).show();

                            Intent intent = new Intent(LoginActivity.this, UserActivity.class);
                            intent.putExtra("nfame", Accounts.get(i).getFristName());
                            intent.putExtra("lname", Accounts.get(i).getLatName());
                            intent.putExtra("email", Accounts.get(i).getEmail());
                            intent.putExtra("country", Accounts.get(i).getCountry().toString());
                            startActivity(intent);
                            finish();
                            return;


                        }
                    }
                    Toast.makeText(LoginActivity.this, "login failed Email Address and password donot match", Toast.LENGTH_LONG).show();

                }
            }
        });

    }
    public void hidekeyboard (View view)
    {
        InputMethodManager imm = (InputMethodManager)this.getSystemService(Service.INPUT_METHOD_SERVICE);
        if(imm != null){
            imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);

        }

    }




}
