package com.lwoo.test.reflection;

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
}
