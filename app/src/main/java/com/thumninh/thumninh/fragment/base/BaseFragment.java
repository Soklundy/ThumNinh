package com.thumninh.thumninh.fragment.base;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.thumninh.thumninh.customView.CustomProgressDialog;

import butterknife.ButterKnife;

/**
 * Created by soklundy on 4/24/18.
 */

public abstract class BaseFragment extends Fragment {

    private CustomProgressDialog mCustomProgressDialog;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(getLayout(), container, false);
        ButterKnife.bind(this, view);
        mCustomProgressDialog = new CustomProgressDialog(getActivity());
        return view;
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
