package com.wang.springboot_mongodb.service;

import com.wang.springboot_mongodb.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProductService {
    public List<Product> getProducts();

    public Product addProduct(Product product);

    public Product deleteProduct(int id);

    public Product updateProduct(int id, Product product);
}
