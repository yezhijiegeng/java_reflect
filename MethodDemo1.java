package com.imooc.reflect;

import java.lang.reflect.Method;

public class MethodDemo1 {
    public static void main(String[] args) {
        A a1 = new A();
//        a1.print("aaaa","ccc");
        Class c = a1.getClass();
        try {
            Method m = c.getMethod("print",new Class[]{int.class,int.class});

            //反射用m 对象调用
//            m.invoke(a1,10,30);
//            Object o = m.invoke(a1,new Object[]{10,50});

            Object o = m.invoke(a1,10,20);
            System.out.println("=====================");
            Method m1 = c.getMethod("print",String.class,String.class);
            o = m1.invoke(a1,"Hello","weorld");
            System.out.println("=====================");
            Method m2 = c.getMethod("print");
            m2.invoke(a1);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

class A{
    public void print (){
        System.out.println("hello world!");
    }
    public void print(int a,int b){
        System.out.println(a+b);
    }
    public void print(String a,String b){
        System.out.println(a.toUpperCase()+","+b.toUpperCase());
    }
}
