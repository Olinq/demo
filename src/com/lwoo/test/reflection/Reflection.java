package com.lwoo.test.reflection;

import sun.rmi.runtime.Log;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Reflection {
    public static void main(String[] args) throws Exception{
        //每一种类型对应的Class对象只有一个，地址相同
        Class c1="asd".getClass();
        Class c2=null;
        try {
            c2=Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(c1+"-"+c2);
        Boolean carson=true;
        Class classType=carson.getClass();
        System.out.println(classType);

        //任意类型
        System.out.println(Boolean.class);
        System.out.println(int.class);
        //静态方法 Class.forName(String)
        System.out.println(Class.forName("java.lang.Boolean"));
        //java.lang.reflect.Type
        System.out.println(Boolean.TYPE);
        System.out.println(Reflection.class);
        /*---------------------------------------------------------*/
        System.out.println(" /*---------------------------------------------------------*/");
        Class c=Demo.class;
        try {
            Constructor constructor=c.getConstructor(String.class,int.class);
            Demo demo=(Demo) constructor.newInstance("demo",23);
            System.out.println(demo.toString());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        }
        /*---------------------------------------------------------*/
        System.out.println(" /*---------------------------------------------------------*/");
        Class demo=Demo.class;
        Field[] fields=demo.getDeclaredFields();
        for (Field field:fields) {
            StringBuilder sb=new StringBuilder();
            sb.append("fieldName=").append(field.getName());
            sb.append("\nfieldType=").append(field.getType());
            sb.append("\nfieldModifiers=").append(Modifier.toString(field.getModifiers()));
            Annotation[] ann=field.getAnnotations();
            if (ann.length !=0) {
                    sb.append("\nfieldAnnotations=");
                for (Annotation a:ann) {
                    sb.append(a.toString()).append("  ");
                }
            }else{
                sb .append("\n  --  No Annotatiions  -- ");
            }
            System.out.println(sb.toString());
        }
        System.out.println(" /*---------------------------------------------------------*/");
        Demo d=new Demo("tom",23);
        Class cset=d.getClass();
        try {
            //获取private变量使用getDeclaredField获取
            Field fieldName=cset.getDeclaredField("name");
            Field fieldAge=cset.getDeclaredField("age");
            fieldName.setAccessible(true);
            String name=(String)fieldName.get(d);
            fieldAge.setAccessible(true);
            int age=fieldAge.getInt(d);
            System.out.println("before set,name="+name+",age="+age);
            fieldName.set(d,"Timmy");
            fieldAge.set(d,24);
            System.out.println("after set,"+d.toString());
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
