package com.example.cliff.controllers;

import com.example.cliff.model.Products;
import com.example.cliff.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/products")
    public String products(Model model){
        model.addAttribute("products", productService.listProducts());
        return "products";
    }
    @GetMapping("/products/{id}")
    public String products(@PathVariable Long id, Model model){
        model.addAttribute("product", productService.getProductById(id));
        return "products-info";
    }
    @PostMapping("/products/create")
    public String createProduct(Products products){
        productService.saveProduct(products);
        return "redirect:/products";
    }
    @PostMapping("/products/delete/{id}")
    public String deleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
        return "redirect:/products";
    }
}
