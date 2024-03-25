package com.elasticsearch.app.repository;

import com.elasticsearch.app.model.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends ElasticsearchRepository<Product,Long> {
}
