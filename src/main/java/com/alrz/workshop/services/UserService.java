package com.alrz.workshop.services;

import com.alrz.workshop.domain.User;
import com.alrz.workshop.repository.UserRepository;
import com.alrz.workshop.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(String id) {
        Optional<User> userOpt = userRepository.findById(id);
        if (!userOpt.isPresent()) {
            throw new ObjectNotFoundException("Objeto não encontrado");
        }
        User user = new User(userOpt.get().getId(), userOpt.get().getName(), userOpt.get().getEmail());
        return user;
    }

}
