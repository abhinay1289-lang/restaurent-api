package com.example.service.Impl;

import com.example.dto.UserCredentialsDto;
import com.example.entity.UserCredentialsBO;
import com.example.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserserviceImpl implements UserService {

    @Override
    public UserCredentialsBO validateuserdetails(UserCredentialsDto loginRequest) {

        return null;
    }
}
