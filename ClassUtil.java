package com.imooc.reflect;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassUtil {
    public static void printClassMethodMessage(Object obj){
        Class c = obj.getClass();

        System.out.println("类的名称是："+c.getName());
        /**
         * getMethods 获取所有的public函数，包括父类继承来的方法
         * c.getDeClaredMethod  //获取该类自己声明的方法
         */
        Method[] ms = c.getMethods();
        for (int i=0;i<ms.length;i++){
            //得到方法返回值的类类型
            Class returnType = ms[i].getReturnType();
            System.out.print(returnType.getName()+" ");

            //得到方法的名称
            System.out.print(ms[i].getName()+"(");
            //获取参数类型
            Class[] paramTypes = ms[i].getParameterTypes();
            for (Class class1:paramTypes) {
                System.out.print(class1.getName()+",");
            }
            System.out.println(")");

            /**
             *成员变量也是对象
             * java.lang.reflect.Filed
             * Filed封装了关于成员变量的操作
             * getFileds() 方法获取public成员变量的信息
             * getDeclaredFiled() 获取自己声明的成员变量
             */
            printFieldMessage(c);
        }

    }

    public static void printFieldMessage(Object obj) {
        Class c= obj.getClass();
        Field[] fs = c.getDeclaredFields();
        for(Field field:fs){
            //获取 成员变量的类型的类类型
            Class fileType = field.getType();
            String typeName = fileType.getName();
            //得到成员变量的名称
            String fieldName = field.getName();
            System.out.println(typeName+" "+ fieldName);
        }
    }

    public static void printConMessage(Object obj){
        Class c = obj.getClass();
        Constructor[] cs = c.getDeclaredConstructors();
        for(Constructor constructor:cs){
            System.out.print(constructor.getName()+"(");
            Class[] paramTypes = constructor.getParameterTypes();
            for(Class class1:paramTypes){
                System.out.print(class1.getName()+",");
            }
            System.out.println(")");
        }
    }
}
