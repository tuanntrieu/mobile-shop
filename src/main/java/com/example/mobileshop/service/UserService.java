package com.example.mobileshop.service;

import com.example.mobileshop.domain.entity.User;

import java.util.UUID;

public interface UserService {
    User findById(UUID id);
}
