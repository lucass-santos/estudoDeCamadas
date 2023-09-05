package com.estudos.estudoDeCamadas.service;

import com.estudos.estudoDeCamadas.dto.UserDTO;
import com.estudos.estudoDeCamadas.entities.User;
import com.estudos.estudoDeCamadas.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public UserDTO findById(Long id){
        User entity = repository.findById(id).get();
        return new UserDTO(entity);
    }
}
