package com.ecommerce.ddd.services;

import com.ecommerce.ddd.dtos.ProductDTO;
import com.ecommerce.ddd.models.Product;
import com.ecommerce.ddd.models.Base;
import com.ecommerce.ddd.models.Shade;
import com.ecommerce.ddd.repositories.BaseRepository;
import com.ecommerce.ddd.repositories.ProductRepository;
import com.ecommerce.ddd.repositories.ShadeRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductService {
  private final ProductRepository productRepository;
  private final BaseRepository baseRepository;
  private final ShadeRepository shadeRepository;

  public ProductService(ProductRepository productRepository,
                        BaseRepository baseRepository,
                        ShadeRepository shadeRepository ) {
    this.productRepository = productRepository;
    this.baseRepository = baseRepository;
    this.shadeRepository = shadeRepository;
  }

  public List<Product> findAll() {
    return productRepository.findAll();
  }

  public Product create(ProductDTO dto) {
    Base base = baseRepository.findById(dto.getLampBaseId())
            .orElseThrow(() -> new RuntimeException("Base not found"));

    Shade shade = shadeRepository.findById(dto.getLampShadeId())
            .orElseThrow(() -> new RuntimeException("Shade not found"));

    Product product = new Product(
            dto.getPrice(),
            dto.getLampBaseColor(),
            base,
            dto.getLampShadeColor(),
            shade
    );

    return productRepository.save(product);
  }
}
