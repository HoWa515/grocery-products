package com.wang.springboot_mongodb.service.impl;

import com.wang.springboot_mongodb.entity.Product;
import com.wang.springboot_mongodb.repo.ProductRepo;
import com.wang.springboot_mongodb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepo productRepo;

    @Override
    public List<Product> getProducts() {
        return productRepo.findAll();
    }

    @Override
    public Product addProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public Product deleteProduct(int id) {
        Product product = productRepo.findById(id).get();
        productRepo.delete(product);
        return  product;
    }

    @Override
    public Product updateProduct(int id, Product product) {
        Product product01= productRepo.findById(id).get();
        product01.setName(product.getName());
        product01.setPrice(product.getPrice());
        product01.setQuantity(product.getQuantity());

        productRepo.save(product01);
        return  product01;
    }
}
