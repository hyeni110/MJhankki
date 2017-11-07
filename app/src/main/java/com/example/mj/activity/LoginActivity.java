package com.example.mj.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mj.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnLogin, btnSignup, btnSearch;
    Intent intent;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
//      startActivity(new Intent(this, SplashActivity.class));
        btnLogin = (Button)findViewById(R.id.login);
        btnSignup = (Button)findViewById(R.id.signup);
        btnSearch = (Button)findViewById(R.id.search);

        btnLogin.setOnClickListener(this);
        btnSignup.setOnClickListener(this);
        btnSearch.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.login:
                intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.signup:
                intent = new Intent(this, SignUpActivity.class);
                startActivity(intent);
                break;
            case R.id.search:
                intent = new Intent(this, SearchActivity.class);
                startActivity(intent);
                break;
        }

    }
}
