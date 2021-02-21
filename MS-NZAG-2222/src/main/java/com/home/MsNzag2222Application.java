package com.home;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class MsNzag2222Application {
// This is main method of NZAG-2222.
	public static void main(String[] args) {
		SpringApplication.run(MsNzag2222Application.class, args);
	}

}
