package com.example.billingservice.openfeigh;

import com.example.billingservice.entities.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "CUSTOMER-SERVICE")
public interface CustomerServiceRestClient {
    //recuperer la liste des customers
    @GetMapping(path = "/api/customers")
    public List<Customer> getCustomers();

    @GetMapping(path = "/api/customers/{id}")
    public Customer getCustomer(@PathVariable(name = "id") String id);

}
