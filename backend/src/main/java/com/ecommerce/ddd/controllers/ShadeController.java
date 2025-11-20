package com.ecommerce.ddd.controllers;

import com.ecommerce.ddd.models.Shade;
import com.ecommerce.ddd.services.ShadeSevice;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shades")
public class ShadeController {
  private final ShadeSevice service;

  public ShadeController(ShadeSevice service) {
    this.service = service;
  }

  @GetMapping
  public ResponseEntity<List<Shade>> findAll() {
    return ResponseEntity.ok(service.findAll());
  }

  @PostMapping
  public ResponseEntity<Shade> create(@RequestBody Shade shade) {
    return ResponseEntity.ok(service.create(shade));
  }
}
