package prg.openlab.openlabcustomerservice.web;

import org.springframework.web.bind.annotation.*;
import prg.openlab.openlabcustomerservice.dtos.CustomerRequestDTO;
import prg.openlab.openlabcustomerservice.dtos.CustomerResponseDTO;
import prg.openlab.openlabcustomerservice.service.CustomerService;

import java.util.List;
import java.util.UUID;

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
    public CustomerResponseDTO save(@RequestBody CustomerRequestDTO customerRequestDTO){
        //générer le id u customer aleatoirement :
        customerRequestDTO.setId(UUID.randomUUID().toString());
        return customerService.save(customerRequestDTO);
    }
    //methode pour récuperer un client :
    @GetMapping(path = "/customers/{id}")
    public CustomerResponseDTO getCustomer(@PathVariable String id){
        return customerService.getCustomer(id);
    }
    // methode pour modifier un cusomer
    @PutMapping(path = "/customers/{id}")
    public CustomerResponseDTO update(@RequestBody CustomerRequestDTO customerRequestDTO,@PathVariable String id){
        customerRequestDTO.setId(id);
     return customerService.updateCustomer(customerRequestDTO);
    }

    // methode pour supprimer un customer :
    @DeleteMapping("/customers/{id}")
    public void delete(@PathVariable String id){
        customerService.deleteCustomer(id);
    }

}
