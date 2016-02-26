package com.example.sks.myapplication.guanchazhe;

/**
 * Created by sks on 16/2/26.
 */
public class Main {
    public void main(){
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
}
