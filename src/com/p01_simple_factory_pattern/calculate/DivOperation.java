package com.p01_simple_factory_pattern.calculate;


/**
 * Created by yangyue on 2017/2/24.
 */
public class DivOperation extends Operation {
    @Override
    public double getResult() {
        if (getNumberB() == 0){
            throw new RuntimeException("除数不能为0");
        }
        return getNumberA()/getNumberB();
    }
}
