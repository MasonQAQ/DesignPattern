package com.p04_proxy_pattern.proxy_internet;

/**
 * Created by yangyue on 2017/2/26.
 */
public class Resource {
    private String ip;

    public Resource() {
    }

    public Resource(String ip) {
        this.ip = ip;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
