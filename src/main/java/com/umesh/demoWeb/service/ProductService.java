package com.umesh.demoWeb.service;

import com.umesh.demoWeb.model.Product;
import com.umesh.demoWeb.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class ProductService {

//    List<Product> products = new ArrayList<>(Arrays.asList(new Product(101, "Apple", 50000), new Product(102, "Mac", 55000),
//            new Product(103, "Airpods", 17000)));

    @Autowired
    ProductRepo repo;

    public List<Product> getProducts() {
        return repo.findAll();
    }

    public Product getProductById(int proId) {
        return repo.findById(proId).orElse(new Product());
    }

    public void addProduct(Product prod) {
        repo.save(prod);
    }

    public void updateProduct(Product prod) {
        repo.save(prod);
    }

    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);
    }
}
