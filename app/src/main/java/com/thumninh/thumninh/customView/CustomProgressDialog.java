package com.thumninh.thumninh.customView;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;

import com.thumninh.thumninh.R;


/**
 * Created by Lenovo on 8/14/2017.
 */

public class CustomProgressDialog {

    private Dialog mDialogBuilder;

    public CustomProgressDialog(Context context) {
        createProgressDialog(context);
    }

    private void createProgressDialog(Context context) {
        mDialogBuilder = new Dialog(context, android.R.style.Theme_DeviceDefault_Light_Dialog_Alert);
        mDialogBuilder.requestWindowFeature(Window.FEATURE_NO_TITLE);
        mDialogBuilder.setContentView(R.layout.custom_progress_dialog);
        mDialogBuilder.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        /*Window window = mDialogBuilder.getWindow();
        window.setLayout(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);*/
    }

    public void hideLoading() {
        if (mDialogBuilder != null)
            mDialogBuilder.dismiss();
    }

    public void showLoading() {
        if (mDialogBuilder != null)
            mDialogBuilder.show();
    }
}
