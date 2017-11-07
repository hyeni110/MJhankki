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

public class SecondFragment extends Fragment implements View.OnClickListener {
    Intent intent;
    Button btnBuy2, btnCart2;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("by_debug", "onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        //Log.d("by_debug", "onCreateView");
        RelativeLayout layout = (RelativeLayout) inflater.inflate(R.layout.fragment_2, container, false);
        btnBuy2 = (Button)layout.findViewById(R.id.buy2);
        btnCart2 = (Button)layout.findViewById(R.id.cart2);
        btnBuy2.setOnClickListener(this);
        btnCart2.setOnClickListener(this);
        return layout;
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.buy2:
                intent = new Intent(getActivity(), BuyActivity.class);
                startActivity(intent);
                break;
            case R.id.cart2:
                intent = new Intent(getActivity(), CartActivity.class);
                startActivity(intent);

        }
    }
}
