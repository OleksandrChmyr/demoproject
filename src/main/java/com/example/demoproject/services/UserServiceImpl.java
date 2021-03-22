package com.example.demoproject.services;

import java.util.List;

import com.example.demoproject.entity.User;
import com.example.demoproject.repository.AbstractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor

public class UserServiceImpl implements UserService<User> {
    @Autowired
    @Qualifier("jpaRepositoryImpl")
    private final AbstractRepository<User> repository;

    @Override
    public void create(User user) {
        repository.create(user);
    }

    @Override
    public List<User> getAll() {
        return repository.getAll();
    }
}
