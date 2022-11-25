package com.niit.demo.service;

import com.niit.demo.domain.Product;

import java.util.List;

public interface ProductService {
    public Product saveProduct(Product product);
    public List<Product>getAllProduct();
}
