package prg.openlab.openlabcustomerservice.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class CustomerRequestDTO {
    String id;
    private String name ;
    private String email;
}
