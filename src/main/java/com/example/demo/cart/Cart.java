package com.example.demo.cart;

import com.example.demo.product.Product;

import java.util.Date;

public class Cart {

    private  Long cartID;
    private Product product;
    private Date date;

    public Cart() {
    }

    public Cart(Long cartID, Product product, Date date) {
        this.cartID = cartID;
        this.product = product;
        this.date = date;
    }

    public Long getCartID() {
        return cartID;
    }

    public void setCartID(Long cartID) {
        this.cartID = cartID;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cartID=" + cartID +
                ", product=" + product +
                ", date=" + date +
                '}';
    }
}
