package com.Ecommercial.Portal.Rest;

import com.Ecommercial.Portal.Entity.Customer;
import com.Ecommercial.Portal.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerRestCantroller {

    private CustomerService customerService;

    @Autowired
    public CustomerRestCantroller(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/customer")
    public List<Customer> findall() {
        return customerService.findAll();   }

        @GetMapping("/customer/{customerId}")
    public Customer findCustomerById(@PathVariable int customerId)
        {
            Customer customer=customerService.findById(customerId);
            if (customer==null)
            {
                throw new RuntimeException("Customer is not available"+customerId);
            }
            return customer;
        }

        @PostMapping("/customer")
        public Customer addCustomer(@RequestBody Customer customer)
        {
            customer.setId(0);
            customerService.save(customer);
            return customer;
        }

        @PutMapping("/customer")
    public Customer updateCustomer(@RequestBody Customer customer)
        {
            customerService.save(customer);
            return customer;
        }

        @DeleteMapping("/customer/{customerId}")
    public String deletedCustomerById(int customerId)
        {
            Customer customer=customerService.findById(customerId);
            if (customer==null)
            {
                throw new RuntimeException("Customer is not available"+customerId);
            }
            customerService.deleteById(customerId);
            return "Deleetd";
        }


}