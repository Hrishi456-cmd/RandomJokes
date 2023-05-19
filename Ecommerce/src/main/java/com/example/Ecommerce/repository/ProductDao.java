package com.example.Ecommerce.repository;

import com.example.Ecommerce.models.Product;
import org.springframework.stereotype.Repository;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductDao {

List<Product> cart;

public ProductDao()
{
    System.out.println("create dummy Product");
    cart =  new ArrayList<>();
    cart.add(new Product("0","Mainak","0","Dummy"));
}

    public List<Product>  fetchALL() {

    return cart;


    }

    public boolean save(Product product) {
cart.add(product);
return true;
    }
}
