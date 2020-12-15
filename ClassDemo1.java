package com.imooc.reflect;

public class ClassDemo1 {
    public static void main(String[] args) {
        Foo foo1 = new Foo();
        //任何一个类都有一个隐含的静态成员变量
        Class c1 =  Foo.class;
        //通过getClass方法
        Class c2 = foo1.getClass();
        //c1、c2 是类类型（class type）
        //万事万物皆是对象
        System.out.println(c1==c2);

        //第三种表达方式
        Class c3 = null;
        try {
           c3 = Class.forName("com.imooc.reflect.Foo");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        System.out.println(c2==c3);

        //通过该类的类型创造该类的实例
        try {
            Foo foo = (Foo)c1.newInstance();
        }catch (InstantiationException e){
            e.printStackTrace();
        }catch (IllegalAccessException e){
            e.printStackTrace();
        }

    }
}

class Foo{
    void print(){
        System.out.println("Foo");
    }
}

//动态加载类
//编译加载类-静态加载类 new都是静态加载类