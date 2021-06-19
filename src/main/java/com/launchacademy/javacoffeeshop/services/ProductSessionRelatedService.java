package com.launchacademy.javacoffeeshop.services;

import com.launchacademy.javacoffeeshop.models.Product;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

@Service
@SessionScope
public class ProductSessionRelatedService implements ProductService {
  private List<Product> products;

  public ProductSessionRelatedService() {
    this.products = new ArrayList<Product>();

    Product product = new Product();

    product.setId(1);
    product.setName("Americano");
    product.setDescription("Coffee and water. Rich and smooth");
    product.setPrice(4.99);
    product.setCaffeineRating(1);
    this.products.add(product);


    product = new Product();
    product.setId(2);
    product.setName("Red Eye");
    product.setDescription("Get an extra Jolt with a shot of espresso.");
    product.setPrice(6.49);
    product.setCaffeineRating(2);
    this.products.add(product);

    product = new Product();
    product.setId(3);
    product.setName("Decaf");
    product.setDescription("Coffee without the pep.");
    product.setPrice(4.49);
    product.setCaffeineRating(0);
    this.products.add(product);
  }

  public List<Product> findAll() {
    return this.products;
  }

  public Product get(Integer id) {
    return this.products.get(id-1);
  }

  public void addToList(Product product) {
    this.products.add(product);
  }
}