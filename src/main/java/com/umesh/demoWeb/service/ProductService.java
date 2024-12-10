package com.umesh.demoWeb.service;

import com.umesh.demoWeb.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;


@Service
public class ProductService {

    List<Product> products = Arrays.asList(new Product(101, "Apple", 50000), new Product( 102, "Mac", 55000));

    public List<Product> getProducts(){
        return products;
    }
}
