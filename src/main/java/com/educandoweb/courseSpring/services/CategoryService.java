package com.educandoweb.courseSpring.services;

import com.educandoweb.courseSpring.entities.Category;
import com.educandoweb.courseSpring.entities.Order;
import com.educandoweb.courseSpring.repositories.CategoryRepository;
import com.educandoweb.courseSpring.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> obj= repository.findById(id);
        return obj.get();
    }
}
