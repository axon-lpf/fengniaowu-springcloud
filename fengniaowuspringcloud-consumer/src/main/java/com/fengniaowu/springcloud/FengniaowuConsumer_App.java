package com.fengniaowu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.fengniaowu.springcloud"})
@ComponentScan("com.fengniaowu.springcloud")
@EnableCircuitBreaker    //对hystrixR熔断机制的支持
public class FengniaowuConsumer_App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SpringApplication.run(FengniaowuConsumer_App.class, args);
	}

}
