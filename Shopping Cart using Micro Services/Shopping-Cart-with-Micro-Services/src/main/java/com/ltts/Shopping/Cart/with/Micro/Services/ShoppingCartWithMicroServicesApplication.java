package com.ltts.Shopping.Cart.with.Micro.Services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ShoppingCartWithMicroServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingCartWithMicroServicesApplication.class, args);
	}

}
