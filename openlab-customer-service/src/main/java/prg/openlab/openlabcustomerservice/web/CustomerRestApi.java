package prg.openlab.openlabcustomerservice.web;

import org.springframework.web.bind.annotation.*;
import prg.openlab.openlabcustomerservice.dtos.CustomerRequestDTO;
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
    //recupérer la liste des clients :
    @GetMapping(path = "/customers")
    public List<CustomerResponseDTO> allCustomers(){
      return customerService.listCustomers();
    }
    //ajouter un nouveau client :
    @PostMapping(path = "/customers")
    public CustomerResponseDTO save(CustomerRequestDTO customerRequestDTO){
        return customerService.save(customerRequestDTO);
    }
    //methode pour récuperer un client :
    @GetMapping(path = "/customers/{id}")
    public CustomerResponseDTO getCustomer(@PathVariable String id){
        return customerService.getCustomer(id);
    }

}
