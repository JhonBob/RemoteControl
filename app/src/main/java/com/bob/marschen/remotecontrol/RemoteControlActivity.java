package com.bob.marschen.remotecontrol;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.Window;


public class RemoteControlActivity extends SingleFragmentActivity {
    @Override
    protected Fragment creatFragment() {
        return new RemoteControlFragment();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
    }
}
