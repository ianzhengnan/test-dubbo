package com.ian.dubbo.demo.provider;

import com.ian.dubbo.demo.service.DemoService;

public class DemoServiceImpl implements DemoService {

	public String sayHello(String name) {
		return "Hello " + name;
	}

}
