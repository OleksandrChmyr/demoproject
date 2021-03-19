package com.example.demoproject.services;

import java.util.List;

import com.example.demoproject.entity.User;
import com.example.demoproject.repository.AbstractRepository;
import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor

public class UserServiceImpl implements UserService<User>{

    private final AbstractRepository<User> jdbcRepository;

    @Override
    public void create(User user) {
        jdbcRepository.create(user);
    }

    @Override
    public List<User> getAll() {
        return jdbcRepository.getAll();
    }
}
