package com.ecommerce.ddd.services;

import com.ecommerce.ddd.models.Product;
import com.ecommerce.ddd.repositories.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductService {
  private final ProductRepository repository;

  public ProductService(ProductRepository repository) {
    this.repository = repository;
  }

  public List<Product> findAll() {
    return repository.findAll();
  }

  public Product create(Product product) {
    return repository.save(product);
  }
}
