package org.emart_seller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class SellerApp 
{
	public static void main(String[] args) {
		SpringApplication.run(SellerApp.class, args);
		
	}
}
 