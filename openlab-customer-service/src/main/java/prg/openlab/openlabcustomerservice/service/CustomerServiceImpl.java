package prg.openlab.openlabcustomerservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import prg.openlab.openlabcustomerservice.dtos.CustomerRequestDTO;
import prg.openlab.openlabcustomerservice.dtos.CustomerResponseDTO;
import prg.openlab.openlabcustomerservice.entities.Customer;
import prg.openlab.openlabcustomerservice.mappers.CustomerMapper;
import prg.openlab.openlabcustomerservice.repositories.CustomerRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    private CustomerMapper customerMapper;

    public CustomerServiceImpl(CustomerRepository customerRepository,CustomerMapper customerMapper) {
        this.customerRepository = customerRepository;
        this.customerMapper=customerMapper;
    }

    @Override
    public CustomerResponseDTO save(CustomerRequestDTO customerRequestDTO) {
        //mapping object object
        /*Customer customer=new Customer();
        customer.setId(customerRequestDTO.getId());
        customer.setName(customerRequestDTO.getName());
        customer.setEmail(customerRequestDTO.getEmail());
        Customer savedCustomer = customerRepository.save(customer);*/
        Customer customer=customerMapper.customerRequestDTOToCustomer(customerRequestDTO);
        Customer savedCustomer = customerRepository.save(customer);

        /*CustomerResponseDTO customerResponseDTO = new CustomerResponseDTO();
        customerResponseDTO.setId(savedCustomer.getId());
        customerResponseDTO.setEmail(savedCustomer.getEmail());
        customerResponseDTO.setName(savedCustomer.getName());*/
        CustomerResponseDTO customerResponseDTO = customerMapper.customerToCustomerResponseDTO(customer);
        return customerResponseDTO;
    }

    @Override
    public CustomerResponseDTO getCustomer(String id) {
        Customer customer=customerRepository.findById(id).get();
        return customerMapper.customerToCustomerResponseDTO(customer);
    }

    @Override
    public CustomerResponseDTO updateCustomer(CustomerRequestDTO customerRequestDTO) {
        Customer customer=customerMapper.customerRequestDTOToCustomer(customerRequestDTO);
        Customer updatedCustomer= customerRepository.save(customer);
        return customerMapper.customerToCustomerResponseDTO(updatedCustomer);
    }

    @Override
    public List<CustomerResponseDTO> listCustomers() {
        List<Customer>customers=customerRepository.findAll();
        List<CustomerResponseDTO> customerResponseDTOS=customers.stream().
                map(cus->customerMapper.customerToCustomerResponseDTO(cus)).collect(Collectors.toList());
        return customerResponseDTOS;
    }
}
