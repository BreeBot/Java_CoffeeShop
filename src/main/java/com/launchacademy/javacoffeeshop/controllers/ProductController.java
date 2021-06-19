package com.launchacademy.javacoffeeshop.controllers;

import com.launchacademy.javacoffeeshop.models.Product;
import com.launchacademy.javacoffeeshop.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.server.ResponseStatusException;

@Controller
@RequestMapping("/products")

public class ProductController {


  private ProductService service;

  @Autowired
  public ProductController(ProductService service) {
    this.service = service;
  }

  @GetMapping
  public String listProducts(Model model) {
    model.addAttribute("products", service.findAll());
    return "/products/index";
  }

  @GetMapping("/show/{id}")
  public String getProduct(@PathVariable Integer id, Model model) {
    if (id > service.findAll().size() || id <= 0) {
      throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    } else {
      Product product = service.get(id);
      model.addAttribute("product", product);
      return "products/show";
    }
  }

  @GetMapping("/new")
  public String addNewProduct(@ModelAttribute Product product) {
    return "products/new";
  }

  @PostMapping
  public String createNewProduct(@ModelAttribute Product product) {
    int id = service.findAll().size() + 1;
    product.setId(id);
    service.addToList(product);
    return "redirect:/products/show/" + product.getId();
  }

}
















