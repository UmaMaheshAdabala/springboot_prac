package com.umesh.demoWeb.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Product {
    @Id
    int proId;
    String proName;
    int price;

    public Product() {
        this.proId = proId;
        this.proName = proName;
        this.price = price;
    }

    public void setProId(int proId) {
        this.proId = proId;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getProId() {
        return proId;
    }

    public String getProName() {
        return proName;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "proId=" + proId +
                ", proName='" + proName + '\'' +
                ", price=" + price +
                '}';
    }
}
