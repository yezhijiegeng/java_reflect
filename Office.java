package com.imooc.reflect;

class Office{
	public static void main(String[] args){
		//new 对象创建的是静态加载类
		if("Word".equals(args[0])){
			Word w = new Word();
			w.start();
		}
		if("Excel".equals(args[0])){
			Excel e = new Excel();
			e.start();
		}
	}
}