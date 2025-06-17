package com.educandoweb.courseSpring.repositories;

import com.educandoweb.courseSpring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
