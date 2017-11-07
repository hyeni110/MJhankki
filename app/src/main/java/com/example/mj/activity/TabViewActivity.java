package com.example.mj.activity;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.Button;

import com.example.mj.FirstFragment;
import com.example.mj.R;
import com.example.mj.SecondFragment;
import com.example.mj.ThirdFragment;

/**
 * Created by 우상훈 on 2017-10-21.
 */

public class TabViewActivity extends FragmentActivity implements View.OnClickListener{
    Fragment fr1, fr2, fr3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab_view_activity);

        Button btn_first = (Button)findViewById(R.id.btn_first);
        Button btn_second = (Button)findViewById(R.id.btn_second);
        Button btn_third = (Button)findViewById(R.id.btn_third);

        btn_first.setOnClickListener(this);
        btn_second.setOnClickListener(this);
        btn_third.setOnClickListener(this);

        fr1 = new FirstFragment();
        fr2 = new SecondFragment();
        fr3 = new ThirdFragment();
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.btn_first:
               // setFragment(fr1);
                setFragmentForAnimation(fr1);
                break;
            case R.id.btn_second:
               // setFragment(fr2);
                setFragmentForAnimation(fr2);
                break;
            case R.id.btn_third:
               // setFragment(fr3);
                setFragmentForAnimation(fr3);
                break;
        }
    }

    public void setFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container,fragment);
        fragmentTransaction.commit();
    }

    public void setFragmentForAnimation(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.slide_in_up, 0, 0, R.anim.slide_in_down);
        fragmentTransaction.replace(R.id.fragment_container,fragment);
        fragmentTransaction.commit();
    }
}
