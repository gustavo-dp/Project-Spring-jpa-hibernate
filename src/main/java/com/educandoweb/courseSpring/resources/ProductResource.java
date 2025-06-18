package com.educandoweb.courseSpring.resources;

import com.educandoweb.courseSpring.entities.Product;
import com.educandoweb.courseSpring.entities.User;
import com.educandoweb.courseSpring.services.ProductService;
import com.educandoweb.courseSpring.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductResource {

    @Autowired
    private ProductService service;

    @GetMapping
    public ResponseEntity<List<Product>> findAll(){
        List<Product> products = service.findAll();
        return ResponseEntity.ok().body(products);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id){
        return ResponseEntity.ok().body(service.findById(id));
    }

}
