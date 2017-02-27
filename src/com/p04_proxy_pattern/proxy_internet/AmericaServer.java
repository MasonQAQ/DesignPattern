package com.p04_proxy_pattern.proxy_internet;

/**
 * Created by yangyue on 2017/2/26.
 */
public class AmericaServer implements InternetRequest {


    private static String needProxyIp = "1.1.1.1";
    ChinaComputer chinaComputer;
    private String ip;

    public AmericaServer(String ip,Resource resource) {
        this.ip = ip;
        chinaComputer = new ChinaComputer(needProxyIp,resource);
    }

    @Override
    public void getInternetResource() {
        chinaComputer.getInternetResource();
    }
}
