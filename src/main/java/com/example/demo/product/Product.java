package com.example.demo.product;

import javax.persistence.*;

@Entity
public class Product {

    @Id
    @SequenceGenerator(
            name = "product_sequence",
            sequenceName = "product_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "product_sequence"
    )

    private  Long id;
    private  String productName;
    private  String productDescr;
    private  double productPrice;

    public Product() {
    }

    public Product(Long id, String productName, String productDescr, double productPrice) {
        this.id = id;
        this.productName = productName;
        this.productDescr = productDescr;
        this.productPrice = productPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescr() {
        return productDescr;
    }

    public void setProductDescr(String productDescr) {
        this.productDescr = productDescr;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", productDescr='" + productDescr + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}
