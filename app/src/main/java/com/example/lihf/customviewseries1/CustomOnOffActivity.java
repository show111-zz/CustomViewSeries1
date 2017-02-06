package com.example.lihf.customviewseries1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.lihf.customviewseries1.ui.ToggleView;

/**
 *
 * Created by lihf on 17/2/6.
 */
public class CustomOnOffActivity extends Activity{


    private ToggleView toggleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_on_off_custom);

        toggleView = (ToggleView) findViewById(R.id.toggleView);
//        toggleView.setSwitchBackgroundResource(R.drawable.switch_background);
//        toggleView.setSlideButtonResource(R.drawable.slide_button);
//        toggleView.setSwitchState(true);
//
        // 设置开关更新监听
        toggleView.setOnSwitchStateUpdateListener(new ToggleView.OnSwitchStateUpdateListener(){

            @Override
            public void onStateUpdate(boolean state) {
                Toast.makeText(getApplicationContext(), "state: " + state, 0).show();
            }

        });
    }


}
