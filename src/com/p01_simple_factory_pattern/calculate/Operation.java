package com.p01_simple_factory_pattern.calculate;

/**
 * Created by yangyue on 2017/2/24.
 */
public abstract class Operation {

    private double numberA;
    private double numberB;

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    public abstract double getResult();
}
