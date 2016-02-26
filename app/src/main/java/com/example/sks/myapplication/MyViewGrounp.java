package com.example.sks.myapplication;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by sks on 16/2/25.
 */
public class MyViewGrounp extends LinearLayout {


    public MyViewGrounp(Context context, AttributeSet attrs) {
        super(context, attrs);
    }



    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        switch (ev.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.i("MyViewGrounp","dispatchTouchEvent ACTION_DOWN");
//                return true;
                break;
            case MotionEvent.ACTION_MOVE:
                Log.i("MyViewGrounp","dispatchTouchEvent ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.i("MyViewGrounp","dispatchTouchEvent ACTION_UP");
                break;
//                return true;
            }

        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        switch (ev.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.i("MyViewGrounp","onTouchEvent ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.i("MyViewGrounp","onTouchEvent ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.i("MyViewGrounp","onTouchEvent ACTION_UP");
                break;
        }
        return super.onTouchEvent(ev);
//        return false;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        switch (ev.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.i("MyViewGrounp","onInterceptTouchEvent ACTION_DOWN");

                break;
            case MotionEvent.ACTION_MOVE:
                Log.i("MyViewGrounp","onInterceptTouchEvent ACTION_MOVE");
//                return true;
                break;
            case MotionEvent.ACTION_UP:
                Log.i("MyViewGrounp","onInterceptTouchEvent ACTION_UP");
                break;
        }
        return super.onInterceptTouchEvent(ev);
    }
}
