package com.ecommerce.ddd.models;

import jakarta.persistence.*;

@Entity
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  private Shade lampShade;

  private String lampShadeColor;

  @ManyToOne
  private Base lampBase;

  private String lampBaseColor;

  private double price;

  private Product() {
  }

  public Product(double price, String lampBaseColor, Base lampBase, String lampShadeColor, Shade lampShade, String name) {
    this.price = price;
    this.lampBaseColor = lampBaseColor;
    this.lampBase = lampBase;
    this.lampShadeColor = lampShadeColor;
    this.lampShade = lampShade;
  }

  public Long getId() {
    return id;
  }

  public Shade getLampShadeType() {
    return lampShade;
  }

  public void setLampShadeType(Shade lampShadeType) {
    this.lampShade = lampShadeType;
  }

  public String getLampShadeColor() {
    return lampShadeColor;
  }

  public void setLampShadeColor(String lampShadeColor) {
    this.lampShadeColor = lampShadeColor;
  }

  public Base getLampBase() {
    return lampBase;
  }

  public void setLampBase(Base lampBaseType) {
    this.lampBase = lampBaseType;
  }

  public String getLampBaseColor() {
    return lampBaseColor;
  }

  public void setLampBaseColor(String lampBaseColor) {
    this.lampBaseColor = lampBaseColor;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }
}
