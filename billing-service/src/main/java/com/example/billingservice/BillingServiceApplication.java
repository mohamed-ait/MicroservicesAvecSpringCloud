package com.example.billingservice;

import com.example.billingservice.dtos.InvoiceRequestDTO;
import com.example.billingservice.service.InvoiceService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
@EnableFeignClients
public class BillingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BillingServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(InvoiceService invoiceService){
        return args->{
          invoiceService.save(new InvoiceRequestDTO(new BigDecimal(758884),"C01"));
          invoiceService.save(new InvoiceRequestDTO(new BigDecimal(550184),"C01"));
          invoiceService.save(new InvoiceRequestDTO(new BigDecimal(484521),"C02"));

        };
    }

}
