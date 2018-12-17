package com.thumninh.thumninh.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;

import com.thumninh.thumninh.R;
import com.thumninh.thumninh.activities.base.BaseActivity;

/**
 * Created by soklundy on 4/23/18.
 */

public class SplashScreenActivity extends BaseActivity {

    private static final long SPLASH_DISPLAY_LENGTH = 1500;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initSplashScreen(true);
    }

    @Override
    public int getLayout() {
        return R.layout.activity_splash_screen;
    }

    private void initSplashScreen(boolean hasSesssion) {
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(SplashScreenActivity.this, MainActivity.class);
            ;
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
            SplashScreenActivity.this.startActivity(intent);
            finish();
        }, SPLASH_DISPLAY_LENGTH);
    }
}
