package cn.tedu.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	//获取一个名字，浏览器上输入什么名字，输出，动态
	@RequestMapping("/hello/{name}")
	public String hello(@PathVariable String name) {
		return "2: "+name;
	}
}
