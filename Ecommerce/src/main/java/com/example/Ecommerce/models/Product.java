package com.example.Ecommerce.models;

public class Product {

    private String productId;
    private String productName;
    private String price;
    private String category;

    public Product(String productId, String productName, String price, String category) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.category = category;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
