package com.test;
public class TestSpring {
	public static void main(String[] args) {
		/**
		 * 通过spring容器中创建Hello对象，并调用它的方法
		 */
		//1.加载spring的核心配置文件
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.从spring容器中获取对象（不是自己new）
		Hello hello = (Hello) ac.getBean("hello");
		//3.调用hello对象的方法
		hello.helloSpring();
	}
}
