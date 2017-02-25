package com.p03_decorator_pattern.phone;

/**
 * Created by yangyue on 2017/2/25.
 */
public class Function implements Phone {

    protected Phone function;

    public void addToFunction(Phone function){
        this.function = function;
    }

    @Override
    public void show() {
        if (function!=null){
            function.show();
        }
    }
}
