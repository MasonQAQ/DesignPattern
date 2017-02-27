package com.p04_proxy_pattern.proxy_internet;

/**
 * Created by yangyue on 2017/2/26.
 */
public class ChinaComputer implements InternetRequest {
    private String ip;
    Resource resource;

    public ChinaComputer(String ip,Resource resource) {
        this.ip = ip;
        this.resource = resource;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public void getInternetResource() {
        System.out.println("我是中国的PC,我的IP是"+ip+" ,我已经获取"+resource.getIp()+"的资源");
    }
}
