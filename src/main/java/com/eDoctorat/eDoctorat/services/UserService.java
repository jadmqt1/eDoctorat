package com.eDoctorat.eDoctorat.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eDoctorat.eDoctorat.models.User;

import com.eDoctorat.eDoctorat.repositories.UserRepository;
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public List<User> getAll() {
      return userRepository.findAll();
    }
}
