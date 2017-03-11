package com.p12_state_pattern.work2;

/**
 * Created by yangyue on 2017/3/8.
 */
public class NoonState implements State {

    @Override
    public void doSomething(Firm firm) {
        if (firm.hour < 13){
            System.out.println("吃中午饭,午休");
        }else {
            firm.state = new AfterNoonState();
            firm.doSomething();
        }
    }
}
