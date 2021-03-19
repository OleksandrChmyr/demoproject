package com.example.demoproject.repository;

import com.example.demoproject.entity.User;

import java.util.List;

public interface AbstractRepository <T> {

    List<T> getAll();
    void create(User user);
}
