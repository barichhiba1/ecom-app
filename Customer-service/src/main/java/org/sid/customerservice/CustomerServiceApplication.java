package org.sid.customerservice;

import org.sid.customerservice.config.CustomerConfigParams;
import org.sid.customerservice.entities.Customer;
import org.sid.customerservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.List;

@SpringBootApplication
@EnableConfigurationProperties(CustomerConfigParams.class)
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }
@Bean
public CommandLineRunner commandLineRunner(CustomerRepository customerRepository,
RepositoryRestConfiguration restConfiguration) {
    return args -> {
        restConfiguration.exposeIdsFor(Customer.class);
        customerRepository.saveAll(
                List.of(
                        Customer.builder().name("Hiba").email("Hiba@gmail.com").build(),
                        Customer.builder().name("Hanane").email("Hanane@gmail.com").build(),
                        Customer.builder().name("Ali").email("Ali@gmail.com").build()
                )
            );
        customerRepository.findAll().forEach(System.out::println);
    };
}}

