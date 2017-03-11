package com.p15_composite_pattern.company;

/**
 * Created by yangyue on 2017/3/9.
 */
public class StringUtil {

    private static StringUtil instance = null;
    private static Integer LOCK = 0;

    private StringUtil() {
    }

    //懒汉模式
    public static StringUtil getInstance(){
        if (instance == null){
            synchronized (LOCK){ // 第一个进入后,第二个只能在外面等待
                if (instance == null){ // 如果两个线程同时通过第一个null的判断,这儿为了防止再次被实例化
                    instance = new StringUtil();
                }
            }
        }
        return instance;
    }

    public String copyStringForNTimes(String str, int times){
        String s = "";
        for (int i = 0; i<times; i++){
            s += str;
        }
        return s;
    }
}
