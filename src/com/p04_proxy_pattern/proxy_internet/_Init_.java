package com.p04_proxy_pattern.proxy_internet;

/**
 * Created by yangyue on 2017/2/26.
 */
public class _Init_ {
    public static void main(String[] args) {
        Resource resource = new Resource("8.8.8.8");//google的资源,中国电脑没法直接访问
        AmericaServer americaServer = new AmericaServer("4.4.4.4",resource);
        americaServer.getInternetResource();
    }
}
