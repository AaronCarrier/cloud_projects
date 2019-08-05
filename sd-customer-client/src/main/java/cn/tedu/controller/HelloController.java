package cn.tedu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {
	//第一种解决方案RestTemplate对象
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/hello/{name}")
	public String hello(@PathVariable String name) {
		//如果去调用服务的提供者呢？
		String url = "http://localhost:7900/hello/"+name;	//请求地址，写死
		url = "http://provider-user/hello/" + name;		//使用application.name来访问，消灭ip+port变化
		
		return restTemplate.getForObject(url, String.class);
	}
}
