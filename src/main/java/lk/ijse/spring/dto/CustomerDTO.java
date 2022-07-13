package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
//if this is entity add @Entity
public class CustomerDTO {
    //@id
    private String id;
    private String name;
    private String address;
    private double salary;
}
