package com.launchacademy.javacoffeeshop.services;

import com.launchacademy.javacoffeeshop.models.Product;
import java.util.List;

public interface ProductService {
  List<Product> findAll();
  void addToList(Product product);
  Product get(Integer index);
}
