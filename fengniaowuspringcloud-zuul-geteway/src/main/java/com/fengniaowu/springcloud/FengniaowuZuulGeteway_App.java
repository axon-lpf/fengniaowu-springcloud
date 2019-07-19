package com.fengniaowu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class FengniaowuZuulGeteway_App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		SpringApplication.run(FengniaowuZuulGeteway_App.class, args);
	}

}
