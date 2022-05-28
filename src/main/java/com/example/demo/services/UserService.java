package com.example.demo.services;

import com.example.demo.entities.UserEntity;
import com.example.demo.repositories.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

public class UserService {

    @Autowired //Se conecta a la otra clase automaticamente
    private UserRepository userRepository;


    public List<UserEntity> find(){
        return userRepository.findAll();
    }

}
