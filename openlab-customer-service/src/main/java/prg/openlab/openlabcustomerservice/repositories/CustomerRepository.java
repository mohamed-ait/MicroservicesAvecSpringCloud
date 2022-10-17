package prg.openlab.openlabcustomerservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import prg.openlab.openlabcustomerservice.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer,String> {
}
