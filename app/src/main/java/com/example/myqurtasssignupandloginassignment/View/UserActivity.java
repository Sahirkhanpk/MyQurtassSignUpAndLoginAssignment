package com.example.myqurtasssignupandloginassignment.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myqurtasssignupandloginassignment.R;

public class UserActivity extends AppCompatActivity {
    private TextView tvFName,tvLName,tvEmail,tvCountry,btnLogOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        tvFName = (TextView) findViewById(R.id.Name);
        tvLName= (TextView)findViewById(R.id.LName);
        tvEmail = (TextView)findViewById(R.id.Email);
        tvCountry =(TextView) findViewById(R.id.Country);
        btnLogOut = (TextView) findViewById(R.id.btnLogOut);
        btnLogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        if (bundle != null) {
            if (bundle.containsKey("nfame")) {
                tvFName.setText(bundle.getString("nfame"));;

            }
            if (bundle.containsKey("lname")) {
                tvLName.setText(bundle.getString("lname"));;

            }
            if (bundle.containsKey("email")) {
                tvEmail.setText(bundle.getString("email"));;

            }
            if (bundle.containsKey("country")) {
                tvCountry.setText(bundle.getString("country"));;

            }
        }
    }


}
