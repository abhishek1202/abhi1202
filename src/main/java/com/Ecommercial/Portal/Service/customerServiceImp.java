package com.Ecommercial.Portal.Service;

import com.Ecommercial.Portal.Dao.CustomerRepository;
import com.Ecommercial.Portal.Entity.Customer;
import com.Ecommercial.Portal.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class customerServiceImp implements CustomerService {

    private CustomerRepository customerRepository;
    @Autowired
    public customerServiceImp(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public customerServiceImp()
    {}
    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(int theId) {
        Optional<Customer> result=customerRepository.findById(theId);
        Customer customer=null;

        if(result.isPresent())
        {
            customer=result.get();
        }
        else
            throw new RuntimeException("Did not find employee id - " + theId);

        return customer;
    }

    @Override
    public void save(Customer theCustomer) {
        customerRepository.save(theCustomer);
    }

    @Override
    public void deleteById(int theId) {
        customerRepository.deleteById(theId);
    }
}