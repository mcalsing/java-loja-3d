package com.ecommerce.ddd.repositories;

import com.ecommerce.ddd.models.Shade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShadeRepository extends JpaRepository<Shade, Long> {
}
