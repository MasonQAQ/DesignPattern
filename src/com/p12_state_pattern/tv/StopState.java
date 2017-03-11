package com.p12_state_pattern.tv;

/**
 * Created by yangyue on 2017/3/9.
 */
public class StopState implements State {
    @Override
    public void doAction() {
        System.out.println("tv is off");
    }
}
