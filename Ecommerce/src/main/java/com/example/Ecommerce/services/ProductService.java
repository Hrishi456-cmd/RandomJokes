package com.example.Ecommerce.services;

import com.example.Ecommerce.models.Product;
import com.example.Ecommerce.repository.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
@Autowired
ProductDao productDao;
    public List<Product>  getAllProducts()
    {
       return productDao.fetchALL();

    }

    public String addProduct(Product product) {
        boolean status =  productDao.save(product);

        if(status)
            return "added ";
            else
                return "not added";
    }
}
