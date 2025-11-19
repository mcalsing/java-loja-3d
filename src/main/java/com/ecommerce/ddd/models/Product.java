package com.ecommerce.ddd.models;

import jakarta.persistence.*;

@Entity
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  private String color;

  private String type;

  private double price;

  private Product() {
  }

  public Product(double price, String type, String color, String name) {
    this.price = price;
    this.type = type;
    this.color = color;
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }
}
