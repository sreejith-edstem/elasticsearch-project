package com.elasticsearch.app.controller;


import com.elasticsearch.app.model.Product;
import com.elasticsearch.app.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping("/create")
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    @GetMapping("/findAll")
    public Iterable<Product> getAllProducts() {
        return productService.getAllProducts();
    }
    @PutMapping("/update/{productId}")
    public Product updateProduct(@RequestBody Product product, @PathVariable long productId){
        return productService.updateProduct(product,productId);
    }
    @DeleteMapping("/delete/{productId}")
    public void deleteProduct(@PathVariable long productId){
        productService.deleteProduct(productId);
    }

}
