package cn.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients			//标识是一个Feign提供者
public class FeignRunApp {
	public static void main(String[] args) {
		SpringApplication.run(FeignRunApp.class, args);
	}
}
