package com.example.cliff.model;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class Products {
    private String title;
    private String description;
    private String city;
    private String author;
    private int price;
    private Long id;
}
