package com.ecommerce.ddd.services;

import com.ecommerce.ddd.models.Shade;
import com.ecommerce.ddd.repositories.ShadeRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ShadeSevice {
  private final ShadeRepository repository;

  public ShadeSevice(ShadeRepository repository) {
    this.repository = repository;
  }

  public List<Shade> findAll() {
    return repository.findAll();
  }

  public Shade create(Shade shade) {
    return repository.save(shade);
  }
}
