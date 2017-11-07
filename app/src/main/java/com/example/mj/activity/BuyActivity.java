package com.example.mj.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.mj.FirstFragment;
import com.example.mj.R;

/**
 * Created by 우상훈 on 2017-11-03.
 */

public class BuyActivity extends AppCompatActivity {
    private Button buttonCallDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);
        buttonCallDialog = (Button) findViewById(R.id.buybuy);
        buttonCallDialog.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FragmentManager fm = getSupportFragmentManager();
                FirstFragment dialogFragment = new FirstFragment();
                dialogFragment.show(fm, "fragment_dialog_test");
            }

        });
    }
}
