package com.example.Ecommerce.Controllers;

import com.example.Ecommerce.models.Product;
import com.example.Ecommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value =  "/ProductManagement")
public class ProductController {
@Autowired
    ProductService productService;

@GetMapping(value = "/Products/All")
List<Product> getAllProducts()
{
    return productService.getAllProducts();
}
@PostMapping(value = "/Product")
    String addProduct(@RequestBody Product product)
{
    return productService.addProduct(product);

}
}
