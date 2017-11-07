package com.example.mj.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.mj.R;

/**
 * Created by 우상훈 on 2017-11-01.
 */

public class SearchActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnBack;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        btnBack = (Button)findViewById(R.id.searchBack);
        btnBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}
