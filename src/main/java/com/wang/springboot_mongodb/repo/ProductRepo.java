package com.wang.springboot_mongodb.repo;

import com.wang.springboot_mongodb.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


public interface ProductRepo extends MongoRepository<Product,Integer> {
}
