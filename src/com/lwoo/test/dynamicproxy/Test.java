package com.lwoo.test.dynamicproxy;

import com.lwoo.test.staticproxy.Service;
import com.lwoo.test.staticproxy.ServiceImpl;

import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        Service service=new ServiceImpl();
        service.executeService();
        Service proxyBuyHouse = (Service) Proxy.newProxyInstance(Service.class.getClassLoader(), new Class[]{Service.class}, new DynamicProxyHandler(service));
         proxyBuyHouse.executeService();
        System.exit(0);
    }
}
