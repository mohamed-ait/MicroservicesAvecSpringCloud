package prg.openlab.openlabcustomerservice.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import prg.openlab.openlabcustomerservice.dtos.CustomerResponseDTO;
import prg.openlab.openlabcustomerservice.service.CustomerService;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class CustomerRestApi {
    private CustomerService customerService;

    public CustomerRestApi(CustomerService customerService) {
        this.customerService = customerService;
    }
    //
    @GetMapping(path = "/customers")
    public List<CustomerResponseDTO> allCustomers(){
      return customerService.listCustomers();
    }

}
