package com.p12_state_pattern.work2;

/**
 * Created by yangyue on 2017/3/8.
 */
public class MorningState implements State {

    @Override
    public void doSomething(Firm firm) {
        if (firm.hour < 12){
            System.out.println("上午写代码");
        }else{
            firm.state = new NoonState();
            firm.doSomething();
        }
    }
}
