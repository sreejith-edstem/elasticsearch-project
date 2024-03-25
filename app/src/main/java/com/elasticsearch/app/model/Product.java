package com.elasticsearch.app.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.elasticsearch.annotations.Document;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document(indexName = "products")
public class Product {
    private long id;
    private String name;
    private String description;
    private long quantity;
    private double price;
}
