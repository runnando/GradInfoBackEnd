package com.gradinfo.spring_boot_grad_info.controller;

import com.gradinfo.spring_boot_grad_info.entity.SysStudent;
import com.gradinfo.spring_boot_grad_info.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    @Autowired
    private ProductService service;


    @GetMapping("/studentInformation")
    public SysStudent findAllProducts(@RequestParam("student_name") String name ) {
        return service.findByName(name);
    }
//
    @GetMapping("/studentById")
    public SysStudent findProductById(@RequestParam("student_id") String id) {
        return service.findById(id);
    }
//
//    @GetMapping("/product/{student_name}")
//    public Product findProductByName(@PathVariable String student_name) {
//        return service.getProductByName(student_name);
//    }

//    @PostMapping("/addproduct")
//    public Product addProduct(@RequestBody Product product){
//        return service.saveProduct(product);
//
//    }




}
