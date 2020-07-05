package com.Ecommercial.Portal.Service;

import com.Ecommercial.Portal.Entity.Products;

import java.util.List;

public interface ProductService {
    public List<Products> findAll();

    public Products findById(int theId);

    public void save(Products theProducts);

    public void deleteById(int theId);

    public List<Products> findByRating(int theId);
    public List<Products> findByPricing(int theId);

}