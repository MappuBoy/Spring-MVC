package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customer")
public class CustomerController {

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public CustomerDTO getAllCustomer(){
        return new CustomerDTO("C001","Navod","Thalawathugoda",25000.00);
    }
}
