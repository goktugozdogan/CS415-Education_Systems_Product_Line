package com.example.spl.dance;

public class Costume {
  int id;
  String color;
  DanceStudent owner;
  String size;
  String brand;


  public Costume() {
  }

  public Costume(int id, String color, DanceStudent owner, String size, String brand) {
    this.id = id;
    this.color = color;
    this.owner = owner;
    this.size = size;
    this.brand = brand;
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getColor() {
    return this.color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public DanceStudent getOwner() {
    return this.owner;
  }

  public void setOwner(DanceStudent owner) {
    this.owner = owner;
  }

  public String getSize() {
    return this.size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public String getBrand() {
    return this.brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public Costume id(int id) {
    this.id = id;
    return this;
  }

  public Costume color(String color) {
    this.color = color;
    return this;
  }

  public Costume owner(DanceStudent owner) {
    this.owner = owner;
    return this;
  }

  public Costume size(String size) {
    this.size = size;
    return this;
  }

  public Costume brand(String brand) {
    this.brand = brand;
    return this;
  }

  @Override
  public String toString() {
    return "{" +
      " id='" + getId() + "'" +
      ", color='" + getColor() + "'" +
      ", owner='" + getOwner() + "'" +
      ", size='" + getSize() + "'" +
      ", brand='" + getBrand() + "'" +
      "}";
  }
  
}
