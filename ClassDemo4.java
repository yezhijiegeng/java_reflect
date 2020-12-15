package com.imooc.reflect;

public class ClassDemo4 {
    public static void main(String[] args) {
        ClassUtil.printFieldMessage("Hello");
        System.out.println("================");
        ClassUtil.printFieldMessage(new Integer(1));
        System.out.println("-----------------");
        ClassUtil.printConMessage("Hello");
        System.out.println("------Integer-----------");
        ClassUtil.printConMessage(new Integer(1));
    }
}
