package com.p12_state_pattern.tv;

/**
 * Created by yangyue on 2017/3/9.
 */
public class TVContext {

    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void doAction(){
        state.doAction();
    }
}
