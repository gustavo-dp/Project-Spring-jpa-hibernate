package com.educandoweb.courseSpring.services;

import com.educandoweb.courseSpring.entities.Category;
import com.educandoweb.courseSpring.entities.Product;
import com.educandoweb.courseSpring.repositories.CategoryRepository;
import com.educandoweb.courseSpring.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll(){
        return repository.findAll();
    }

    public Product findById(Long id){
        Optional<Product> obj= repository.findById(id);
        return obj.get();
    }
}
