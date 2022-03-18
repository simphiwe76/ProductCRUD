package com.example.demo.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private  ProductRepository productRepository;
    public List<Product> getAllProduct()
    {
       return  (List<Product>) productRepository.findAll();
    }

    public void addProduct(Product product) {
        productRepository.save(product);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    public void editProduct(Product product, Long id) {

            productRepository.save(product);

    }

    public Product updateView(Long id) {

        return productRepository.getById(id);
    }
}
