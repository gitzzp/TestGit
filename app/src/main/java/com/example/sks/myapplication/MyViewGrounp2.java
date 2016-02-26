package com.example.sks.myapplication;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by sks on 16/2/25.
 */
public class MyViewGrounp2 extends LinearLayout {


    public MyViewGrounp2(Context context, AttributeSet attrs) {
        super(context, attrs);
    }



    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.i("MyViewGrounp2","dispatchTouchEvent");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i("MyViewGrounp2","onTouchEvent");
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.i("MyViewGrounp2","onInterceptTouchEvent");
        return super.onInterceptTouchEvent(ev);
    }
}
