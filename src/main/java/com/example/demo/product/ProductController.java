package com.example.demo.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(value="Product/all")
    public String getAllProduct(Model model){
       List<Product> products = productService.getAllProduct();
       model.addAttribute("productsList",products);
        return "productList";
    }

    @PostMapping(value="/add")
    public String addProduct(Product product){
        productService.addProduct(product);
        return "redirect:/Product/all";
    }
    @RequestMapping(value="/del/{id}")
    public  String deleteProduct(@PathVariable  Long id){
        productService.deleteProduct(id);
        return "redirect:/Product/all";
    }
    @RequestMapping(value="/edit/{id}",method= {RequestMethod.PUT,RequestMethod.GET})
    public String editProduct(Product product,@PathVariable Long id)
    {
        productService.editProduct(product,id);
        return "redirect:/Product/all";
    }
    @RequestMapping(value = "Product/addProduct")
    public String addView(){
        return "addProduct";
    }
    @RequestMapping(value = "/updateProduct/{id}")
    public String updateView(@PathVariable Long id,Model model){
        Product products = productService.updateView(id);
        model.addAttribute("productUp",products);
        return "update";
    }

}
