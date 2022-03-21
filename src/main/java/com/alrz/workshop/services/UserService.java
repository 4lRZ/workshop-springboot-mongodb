package com.alrz.workshop.services;

import com.alrz.workshop.domain.User;
import com.alrz.workshop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> findAll() {
       return userRepository.findAll();
    }

}
