package com.p17_bridge_pattern.phone;

/**
 * Created by yangyue on 2017/3/10.
 */
public class MessageSoft extends HandSetSoft {

    public MessageSoft() {
        softName = "短信";
    }

    @Override
    public void load() {
        System.out.println(softName + "正在加载");
    }

    @Override
    public void run() {
        System.out.println(softName + "正在运行");
    }
}
