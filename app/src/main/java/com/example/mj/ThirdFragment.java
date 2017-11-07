package com.example.mj;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.example.mj.activity.BuyActivity;
import com.example.mj.activity.CartActivity;

/**
 * Created by 우상훈 on 2017-10-21.
 */

public class ThirdFragment extends Fragment implements View.OnClickListener {
    Intent intent;
    Button btnBuy3, btnCart3;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("by_debug", "onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        //Log.d("by_debug", "onCreateView");
        RelativeLayout layout = (RelativeLayout) inflater.inflate(R.layout.fragment_3, container, false);
        btnBuy3 = (Button)layout.findViewById(R.id.buy3);
        btnCart3 = (Button)layout.findViewById(R.id.cart3);
        btnBuy3.setOnClickListener(this);
        btnCart3.setOnClickListener(this);
        return layout;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buy3:
                intent = new Intent(getActivity(), BuyActivity.class);
                startActivity(intent);
                break;
            case R.id.cart3:
                intent = new Intent(getActivity(), CartActivity.class);
                startActivity(intent);
                break;
        }
    }
}
