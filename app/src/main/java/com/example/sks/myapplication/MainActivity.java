package com.example.sks.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;

import com.example.sks.myapplication.guanchazhe.BeiGuanChaZhe;
import com.example.sks.myapplication.guanchazhe.GuanA;
import com.example.sks.myapplication.guanchazhe.GuanB;
import com.example.sks.myapplication.guanchazhe.GuanC;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GuanA guanA = new GuanA();
        GuanB guanB = new GuanB();
        GuanC guanC = new GuanC();
        BeiGuanChaZhe.register(guanA);
        BeiGuanChaZhe.register(guanB);
        BeiGuanChaZhe.register(guanA);
        BeiGuanChaZhe.setDate("第一次改变");
        BeiGuanChaZhe.unRegister(guanB);
        BeiGuanChaZhe.register(guanC);
        BeiGuanChaZhe.setDate("第二次改变");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        BeiGuanChaZhe.clearAll();
    }

    /**
     * 在页面跳转的时候 要用到下一个页面的强引用 而我们一直在强调要解耦和
     * 所以我们在Activity的基类中构造这个方法 利用反射的原理 将Intent跳转页面时进行解耦
     * @param activityName 要跳转的页面的名称
     * @param intent 页面跳转的intent
     */
    public void navitagetorTo(final String activityName, final Intent intent){
        Class<?> clazz ;
        try {
            clazz = Class.forName(activityName);
            if(clazz!=null){
                intent.setClass(this,clazz);
                this.startActivity(intent);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        switch (ev.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.i("MainActivity","dispatchTouchEvent ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.i("MainActivity","dispatchTouchEvent ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.i("MainActivity","dispatchTouchEvent ACTION_UP");
                break;
        }
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        switch (ev.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.i("MainActivity","onTouchEvent ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.i("MainActivity","onTouchEvent ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.i("MainActivity","onTouchEvent ACTION_UP");
                break;
        }
        return super.onTouchEvent(ev);
    }
}
