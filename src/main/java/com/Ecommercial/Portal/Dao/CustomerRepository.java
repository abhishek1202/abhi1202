package com.Ecommercial.Portal.Dao;

import com.Ecommercial.Portal.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}