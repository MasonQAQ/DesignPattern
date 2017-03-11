package com.p12_state_pattern.tv;

/**
 * Created by yangyue on 2017/3/9.
 */
public class _Init_ {
    public static void main(String[] args) {
        TVContext tvContext = new TVContext();
        tvContext.setState(new StartState());
        tvContext.doAction();
        tvContext.setState(new StopState());
        tvContext.doAction();
    }
}
