package com.lwoo.test.staticproxy;

/**
 * 核心业务类
 */
public class ServiceImpl implements Service{

    @Override
    public void executeService() {
        System.out.println("核心服务类方法");
    }
}
