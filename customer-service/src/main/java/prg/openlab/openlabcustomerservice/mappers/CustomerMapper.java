package prg.openlab.openlabcustomerservice.mappers;

import org.mapstruct.Mapper;
import prg.openlab.openlabcustomerservice.dtos.CustomerRequestDTO;
import prg.openlab.openlabcustomerservice.dtos.CustomerResponseDTO;
import prg.openlab.openlabcustomerservice.entities.Customer;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
   CustomerResponseDTO customerToCustomerResponseDTO(Customer customer);
   Customer customerRequestDTOToCustomer(CustomerRequestDTO customerRequestDTO);

}