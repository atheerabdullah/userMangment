package com.example.homeworkspringboot.Repository;

import com.example.homeworkspringboot.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User , Integer> {
}
