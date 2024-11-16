package org.sid.billingservice;

import org.sid.billingservice.model.Product;
import org.sid.billingservice.repository.BillRepository;
import org.sid.billingservice.repository.ProductItemRepository;
import org.sid.billingservice.services.CustomerRestClient;
import org.sid.billingservice.services.ProductRestClient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
@EnableFeignClients
public class BillingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BillingServiceApplication.class, args);
	}

@Bean
	CommandLineRunner start(BillRepository billRepository,
							ProductItemRepository productItemRepository, CustomerRestClient customerRestClient,
							ProductRestClient productRestClient){
		return args -> {
			List<Product>products-


		};

	}

}
