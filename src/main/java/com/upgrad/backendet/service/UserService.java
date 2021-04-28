package com.upgrad.backendet.service;

import com.upgrad.backendet.model.User;
import com.upgrad.backendet.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;


    public void addData(User user) {
        userRepository.save(user);
    }

    public List<User> getAllData() {
        List<User> allUsers=(List<User>) userRepository.findAll();
        return allUsers;
    }

    public void deletePost(Integer userId) {
        userRepository.deleteById(userId);
    }


    public User findByUser(String name) {
        return userRepository.findByName(name);
    }

    public Optional<User> findByUserId(Integer userId) {
        return userRepository.findById(userId);
    }

    public void updateData(User updatedUser) {
        userRepository.save(updatedUser);
    }
}
