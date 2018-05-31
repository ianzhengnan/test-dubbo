package com.ian.dubbo.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ian.dubbo.demo.service.DemoService;

public class Consumer {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
		
		context.start();
		
		DemoService demoService = (DemoService)context.getBean("demoService");
		
		String hello = demoService.sayHello("张三");
		
		System.out.println(hello);
	}
}
