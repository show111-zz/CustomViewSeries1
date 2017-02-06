package com.example.lihf.customviewseries1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import com.example.lihf.customviewseries1.ui.SlideMenu;

/**
 * the five demo
 * Created by lihf on 17/2/6.
 */
public class SlideSideActivity extends Activity implements View.OnClickListener {

    private SlideMenu sm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.act_side_slide);

        sm = (SlideMenu) findViewById(R.id.sm);
        findViewById(R.id.ib_back).setOnClickListener(this);
        findViewById(R.id.btn_five).setOnClickListener(this);

    }

    public void onTabClick(View view){

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.sm:
                sm.switchState();
                break;
            case R.id.btn_five:
                startActivity(new Intent(SlideSideActivity.this, CustomOnOffActivity.class));
                break;
        }

    }


}
