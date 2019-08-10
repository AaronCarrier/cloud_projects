package cn.tedu.controller;

import org.springframework.stereotype.Component;

import cn.tedu.feign.HelloFeign;

@Component
public class HelloFallback implements HelloFeign{

	@Override
	public String hello(String name) {
		// TODO Auto-generated method stub
		return "hystrix";
	}

}
