package com.example.mj;

import android.app.Application;
import android.support.v4.app.Fragment;

/**
 ㅎㅏ이
 */

public class FragmentApplication extends Application {
    Fragment[] fragmentArray;
    Fragment fr1,fr2,fr3;
    @Override
    public void onCreate() {
        super.onCreate();
    }

    public Fragment[] getFragmentArray(){
        if(fragmentArray != null && fragmentArray.length >0){
            return fragmentArray;
        }
        else{
            initFragmentArray();
            return fragmentArray;
        }
    }

    private void initFragmentArray(){
        fr1 = new FirstFragment();
        fr2 = new SecondFragment();
        fr3 = new ThirdFragment();
        fragmentArray = new Fragment[] {fr1, fr2, fr3};
    }
}
