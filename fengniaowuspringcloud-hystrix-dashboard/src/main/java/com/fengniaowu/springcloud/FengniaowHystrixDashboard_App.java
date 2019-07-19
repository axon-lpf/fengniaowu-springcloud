package com.fengniaowu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class FengniaowHystrixDashboard_App {

	public static void main(String[] args) {
	
		SpringApplication.run(FengniaowHystrixDashboard_App.class, args);
	}
}
