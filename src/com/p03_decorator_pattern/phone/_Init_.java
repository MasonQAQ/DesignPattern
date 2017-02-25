package com.p03_decorator_pattern.phone;

/**
 * Created by yangyue on 2017/2/25.
 */
public class _Init_ {
    public static void main(String[] args) {
        Iphone iphone7 = new Iphone();

        Function callFunction = new CallFunction();
        Function messageFunction = new MessagerFunction();
        Function internetFunction = new InternetFunction();

        callFunction.addToFunction(iphone7);//让iphone7能打电话
        messageFunction.addToFunction(callFunction);//让iphone7能发短信
        internetFunction.addToFunction(messageFunction);////让iphone7能上网

        internetFunction.show();
    }
}
