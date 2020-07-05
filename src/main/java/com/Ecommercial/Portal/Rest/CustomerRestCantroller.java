package com.Ecommercial.Portal.Rest;

import com.Ecommercial.Portal.Entity.Customer;
import com.Ecommercial.Portal.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api1")
public class CustomerRestCantroller {

    private CustomerService customerService;

    @Autowired
    public CustomerRestCantroller(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/customer")
    public List<Customer> findall() {
        return customerService.findAll();   }
}