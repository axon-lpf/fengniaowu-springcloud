package com.fengniaowu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableDiscoveryClient //服务发现
@EnableEurekaClient //启用Eureka客户端 启动后会自动注册进eureka服务中
public class ApartmentProvider_App {

	public static void main(String[] args) {
		SpringApplication.run(ApartmentProvider_App.class, args);
	}
}
