package com.estudos.estudoDeCamadas.service;

import com.estudos.estudoDeCamadas.dto.UserDTO;
import com.estudos.estudoDeCamadas.entities.User;
import com.estudos.estudoDeCamadas.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    @Transactional(readOnly = true) //parâmetro readOnly devido ser uma operação apenas de leitura.
    public UserDTO findById(Long id){
        User entity = repository.findById(id).get();
        return new UserDTO(entity);
    }
}
