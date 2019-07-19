package com.fengniaowu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer  //启用Eureka服务端配置
public class EurekaNode1 {

	public static void main(String[] args) {
		
		SpringApplication.run(EurekaNode1.class, args);
	}
}
