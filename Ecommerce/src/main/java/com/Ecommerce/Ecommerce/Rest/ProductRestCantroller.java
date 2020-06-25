package com.Ecommerce.Ecommerce.Rest;

import com.Ecommerce.Ecommerce.Entity.Products;
import com.Ecommerce.Ecommerce.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductRestCantroller {
private ProductService productService;
@Autowired
    public ProductRestCantroller(ProductService productService) {
        this.productService = productService;
    }

    public ProductRestCantroller(){}

    @GetMapping("/products")
    public List<Products> findall(){

    return productService.findAll();
    }
}
