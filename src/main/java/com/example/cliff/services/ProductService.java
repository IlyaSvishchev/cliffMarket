package com.example.cliff.services;

import com.example.cliff.model.Products;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    public Products getProductById(Long id) {
        for (Products product : products){
            if (product.getId().equals(id)){return product;}
        }
        return null;
    }

    List<Products> products = new ArrayList<>();
    private long ID;
    {
        products.add(new Products("Iphone22", "Simple description", "Moscow", "Ilya", 67000, ++ID));
        products.add(new Products("Iphone25", "Simple description", "London", "Basya", 78000, ++ID));
    }
    public List<Products> listProducts(){
        return products;
    }
    public void saveProduct(Products product){
        product.setId(++ID);
        products.add(product);
    }
    public void deleteProduct(Long id){
        products.removeIf(product -> product.getId().equals(id));
    }
}
