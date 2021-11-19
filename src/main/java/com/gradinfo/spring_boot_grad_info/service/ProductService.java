package com.gradinfo.spring_boot_grad_info.service;

import com.gradinfo.spring_boot_grad_info.entity.SysStudent;
import com.gradinfo.spring_boot_grad_info.entity.SysStudentPost;
import com.gradinfo.spring_boot_grad_info.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public SysStudent findByName(String name){
        return repository.findInfoByName(name);
    }
    public SysStudent findById(String id){
        return repository.findInfoById(id);
    }
    //public List<SysStudentPost> findAllStudent(String id){return repository.FindPostNumber(id);};

//    public Product saveProduct(Product product){
//        return repository.save(product);
//
//    }
//    public List<Product> saveProduct(List<Product> products){
//        return repository.saveAll(products);
//
//    }
//    public List<Product> getProducts(){
//        return repository.findAll();
//
//    }
//    public Product getProductById(String student_id){
//
//        return repository.findById(student_id).orElse(null);
//
//    }
//    public Product getProductByName(String student_name){
//
//        return repository.findByName(student_name);
//
//    }
//    public String deleteProduct(int id){
//        repository.deleteById(id);
//        return "product removed" + id;
//    }

//    public Product updateProduct(Product product){
//        Product existingProduct = repository.findById(product.getId()).orElse(null);
//        existingProduct.setName();
//    }

}
