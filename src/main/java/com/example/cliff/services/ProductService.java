package com.example.cliff.services;

import com.example.cliff.model.Products;
import com.example.cliff.repositories.ProductRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {
    private final ProductRepo productRepo;

    public Products getProductById(Long id) {
        return productRepo.findById(id).orElse(null);
    }
    List<Products> products = new ArrayList<>();
    public List<Products> listProducts(){
        return products;
    }
    public void saveProduct(Products product){
        log.info("Saving new {}", product);
        productRepo.save(product);
    }
    public void deleteProduct(Long id){
        productRepo.deleteById(id);
    }

}
