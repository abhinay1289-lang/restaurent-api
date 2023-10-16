package com.example.service;

import com.example.dto.request.LoginDto;
import com.example.entity.UserDetailsBO;

import java.util.List;

public interface UserService {
    public UserDetailsBO validateUserCredentials(LoginDto loginRequest);
}
