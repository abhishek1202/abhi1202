package com.Ecommercial.Portal.Rest;

import com.Ecommercial.Portal.Entity.Products;
import com.Ecommercial.Portal.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/products/{theId}")
    public Products findById(@PathVariable int theId)
    {
        Products products=productService.findById(theId);

        if (products==null)
        {
            throw new RuntimeException("Production id is not found Error"+theId);
        }

        return products;
    }

    @PostMapping("/products")
    public Products addProducts(@RequestBody Products products){
        products.setId(0);
        productService.save(products);
        return products;
    }

    @PutMapping("/products")
    public Products updateProducts(@RequestBody Products products)
    {
        productService.save(products);
        return products;
    }

    @DeleteMapping("/products/{theId}")
    public String deleteById(@PathVariable int theId)
    {
        Products products=productService.findById(theId);
        if (products==null)
        {
            throw new RuntimeException("Product id not available"+ theId);
        }
        productService.deleteById(theId);
        return "Deleted";
    }

    @GetMapping("/rating/{id}")
    public List<Products> findByRating(@PathVariable int id)
    {
        return productService.findByRating(id);
    }
    @GetMapping("/price/{id}")
    public List<Products> findByPricing(@PathVariable int id)
    {
        return productService.findByPricing(id);
    }

}