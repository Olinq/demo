package com.lwoo.test.reflection;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Demo {

    private String name;
    private int age;

    public Demo(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void named(){
        System.out.println("named:"+name);
    }
    public void named(String... names){
        StringBuilder s=new StringBuilder();
        for (String name:names) {
            s.append(name).append(" ");
        }
        System.out.println("named:"+s.toString());
    }
    public void sleep(){
        System.out.println("sleep");
    }
    @Override
    public String toString() {
        return "demo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Integer a=10;
        Integer b=10;
        Boolean ba=true;
        Boolean bb=true;
        Long d=4l;
        System.out.println(bb.equals(ba));
        System.out.println(a.equals(b));
    }
}
