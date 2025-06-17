package com.educandoweb.courseSpring.repositories;

import com.educandoweb.courseSpring.entities.Category;
import com.educandoweb.courseSpring.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {

}
