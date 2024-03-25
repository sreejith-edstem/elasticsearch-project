package com.elasticsearch.app.service;

import com.elasticsearch.app.model.Product;
import com.elasticsearch.app.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class ProductService {
    private final ProductRepository productRepository;

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Iterable<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product updateProduct(Product product, long id) {
        Product product1 = productRepository.findById(id).get();
        product1 = Product.builder()
                .id(product1.getId())
                .name(product1.getName())
                .description(product1.getDescription())
                .quantity(product1.getQuantity())
                .price(product.getPrice())
                .build();
        productRepository.save(product1);
        return product1;
    }

    public void deleteProduct(long id) {
        productRepository.deleteById(id);
    }
}
