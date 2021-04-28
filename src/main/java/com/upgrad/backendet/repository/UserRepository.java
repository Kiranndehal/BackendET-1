package com.upgrad.backendet.repository;

import com.upgrad.backendet.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByName(String name);

}
