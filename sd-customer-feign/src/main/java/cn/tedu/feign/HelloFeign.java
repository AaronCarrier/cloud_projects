package cn.tedu.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("provider-user")			//标识这个是一个Feign的接口
public interface HelloFeign {
	//调用服务提供者方法
	@RequestMapping("/hello/{name}")
	public String hello(@PathVariable String name);	//必须和要调用服务返回值、方法名、参数、参数类型、参数注解要一模一样
}
