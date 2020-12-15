package com.imooc.reflect;

public class ClassDemo2 {
    public static void main(String[] args) {
        Class c1 = int.class;
        Class c2 = String.class;

        System.out.println(c1.getName());
        System.out.println(c2.getName());
        System.out.println(c2.getSimpleName());
    }
}
