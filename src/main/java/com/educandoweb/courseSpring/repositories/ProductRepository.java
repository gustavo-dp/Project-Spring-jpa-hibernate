package com.educandoweb.courseSpring.repositories;

import com.educandoweb.courseSpring.entities.Category;
import com.educandoweb.courseSpring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
