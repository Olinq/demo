package com.lwoo.test.proxy;

/**
 * 代理类
 */
public class ServiceProxy implements Service {
    private Service service;

    public ServiceProxy(Service service) {
        this.service = service;
    }

    //代理类在此处添加相关的日志等
    @Override
    public void executeService() {
        System.out.println("核心业务执行前");
        service.executeService();
        System.out.println("核心业务执行后");
    }
}
