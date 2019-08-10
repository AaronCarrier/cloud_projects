package cn.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients	
//标识是一个Feign提供者

@EnableHystrix
public class EurekaConsumerHystrixApplication {
	public static void main(String[] args) {
		SpringApplication.run(EurekaConsumerHystrixApplication.class, args);
	}
}
