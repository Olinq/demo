package com.lwoo.test.j8;

import java.util.Optional;

/**
 * @author hokli
 * @version 1.0
 * @date 2021/1/27 15:32
 */
public class OptionalDemo {

    public static void main(String[] args) {

        //调用工厂方法创建Optional实例
        Optional<String> name = Optional.of("Sanaulla");
        System.out.println(name.isPresent());
        //传入参数为null，抛出NullPointerException.
        Optional<String> someNull = Optional.of(null);
    }
}
