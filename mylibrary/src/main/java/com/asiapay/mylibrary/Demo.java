package com.asiapay.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class Demo {

    Context context;

    public Demo(Context context)
    {
        this.context=context;

    }

    public void showToast(String msg){
        Toast.makeText(context, msg,Toast.LENGTH_LONG).show();
    }
}
