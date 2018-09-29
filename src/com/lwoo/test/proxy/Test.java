package com.lwoo.test.proxy;

/**
 * 测试
 */
public class Test {
    public static void main(String[] args) {
        Service service=new ServiceImpl();
        service.executeService();
        Service serviceProxy=new ServiceProxy(service);
        serviceProxy.executeService();
    }
}
