package com.p05_factory_method_pattern.leifeng;

/**
 * Created by yangyue on 2017/2/26.
 */
public class UndergraduateFactory implements IFactory {
    @Override
    public Leifeng createLeifeng(String name) {
        return new Undergraduate(name);
    }
}
