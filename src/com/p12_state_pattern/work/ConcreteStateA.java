package com.p12_state_pattern.work;

/**
 * Created by yangyue on 2017/3/8.
 */
public class ConcreteStateA implements State {
    @Override
    public void handle(Context context) {

        System.out.print("目前处于状态A,即将切换到状态B");
        System.out.print(".");
        try {
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println();
        context.setState(new ConcreteStateB());
    }
}
