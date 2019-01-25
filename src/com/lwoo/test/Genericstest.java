package com.lwoo.test;

import java.util.ArrayList;

/**
 * 泛型：类型参数化，将类型以参数的形式传给类或方法
 * <?> 被称作无限定的通配符。
 * ----只保留与具体类型无关的功能。
 * <? extends T> 被称作有上限的通配符。
 * ----在一个范围内确定类别，比如类型T 及 类型T的子类都可以。
 * <? super T> 被称作有下限的通配符。
 *
 */
public class Genericstest {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        //泛型信息只存在于代码编译阶段，在进入 JVM 之前，与泛型相关的信息会被擦除掉，专业术语叫做类型擦除。
        System.out.print(list1.getClass() == list2.getClass());//输出结果为true,因为存在泛型擦除
    }
}
