package com.thumninh.thumninh.activities.base;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.thumninh.thumninh.customView.CustomProgressDialog;

import butterknife.ButterKnife;

/**
 * Created by soklundy on 4/23/18.
 */

public abstract class BaseActivity extends AppCompatActivity {

    private CustomProgressDialog mCustomProgressDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        mCustomProgressDialog = new CustomProgressDialog(this);
        ButterKnife.bind(this);
    }

    public abstract @LayoutRes
    int getLayout();

    protected void showLoadingView() {
        mCustomProgressDialog.showLoading();
    }

    protected void hideLoadingView() {
        mCustomProgressDialog.hideLoading();
    }
}
