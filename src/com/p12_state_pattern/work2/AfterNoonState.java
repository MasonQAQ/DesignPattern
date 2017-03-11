package com.p12_state_pattern.work2;

/**
 * Created by yangyue on 2017/3/8.
 */
public class AfterNoonState implements State {

    @Override
    public void doSomething(Firm firm) {
        if (firm.hour < 17){
            System.out.println("下午写文档");
        }else {
            System.out.println("下班了");
        }
    }
}
