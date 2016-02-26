package com.example.sks.myapplication.guanchazhe;

import java.util.ArrayList;

/**
 * Created by sks on 16/2/26.
 * 这是一个被观察者 当被观察者数据发生变化时 要通知观察者
 */
public class BeiGuanChaZhe {

    private static ArrayList<GuanChaZheJieKou> list = new ArrayList<>();

    /**
     * 通过这个方法 改变被观察者中的数据
     * @param s
     */
    public static void setDate(String s){
        for (GuanChaZheJieKou guanChaZheJieKou : list) {
            if(guanChaZheJieKou!=null){
                guanChaZheJieKou.change(s);
            }
        }
    }

    /**
     * 将观察者的引用添加到集合中 这样来做的话 可以降低耦合 添加和删除观察者不需要改动这里的代码
     * @param guanChaZheJieKou
     */
    public static void register(GuanChaZheJieKou guanChaZheJieKou){
        list.add(guanChaZheJieKou);
    }

    public static void unRegister(GuanChaZheJieKou guanChaZheJieKou){
        list.remove(guanChaZheJieKou);
    }

    public static void clearAll(){
        list.removeAll(list);
    }


}
