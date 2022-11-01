package prg.openlab.openlabcustomerservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import prg.openlab.openlabcustomerservice.dtos.CustomerRequestDTO;
import prg.openlab.openlabcustomerservice.service.CustomerService;

@SpringBootApplication
public class OpenlabCustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenlabCustomerServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(CustomerService customerService ){
        return args -> {
            customerService.save(new CustomerRequestDTO("C01","Adria","adiria@adria.com"));
            customerService.save(new CustomerRequestDTO("C02","openLab","open@openLab.com"));
        };
    }


}
