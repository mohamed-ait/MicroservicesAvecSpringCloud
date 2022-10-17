package prg.openlab.openlabcustomerservice.service;

import prg.openlab.openlabcustomerservice.dtos.CustomerRequestDTO;
import prg.openlab.openlabcustomerservice.dtos.CustomerResponseDTO;

import java.util.List;

public interface CustomerService {
    CustomerResponseDTO save(CustomerRequestDTO customerRequestDTO);
    CustomerResponseDTO getCustomer(String id);
    CustomerResponseDTO updateCustomer(CustomerRequestDTO customerRequestDTO);
    List<CustomerResponseDTO> listCustomers();
}
