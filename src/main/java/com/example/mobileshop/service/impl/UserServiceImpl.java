package com.example.mobileshop.service.impl;

import com.example.mobileshop.domain.entity.User;
import com.example.mobileshop.repository.UserRepository;
import com.example.mobileshop.service.UserService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    UserRepository userRepository;

    @Override
    public User findById(UUID id) {
        return userRepository.findById(id).orElse(null);
    }
}
