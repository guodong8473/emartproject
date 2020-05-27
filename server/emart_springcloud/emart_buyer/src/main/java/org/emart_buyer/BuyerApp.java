package org.emart_buyer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */

@SpringBootApplication
@EnableEurekaClient

public class BuyerApp 
{
	public static void main(String[] args) {
		SpringApplication.run(BuyerApp.class, args);
		
	}
}
 