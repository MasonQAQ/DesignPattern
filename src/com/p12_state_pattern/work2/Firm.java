package com.p12_state_pattern.work2;

/**
 * 公司环境
 * Created by yangyue on 2017/3/8.
 */
public class Firm {

    protected State state;

    protected int hour = 9;

    public Firm(State state) {
        this.state = state;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void doSomething(){
        //System.out.println("当前时间:"+hour);
        state.doSomething(this);
    }
}
