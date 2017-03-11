package com.p12_state_pattern.work;

/**
 * 环境类
 * Created by yangyue on 2017/3/8.
 */
public class Context {

    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void request(){
        state.handle(this);
    }
}
