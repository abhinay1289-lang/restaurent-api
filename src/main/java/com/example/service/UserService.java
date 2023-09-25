package com.example.service;

import com.example.dto.UserCredentialsDto;
import com.example.entity.UserBO;
import com.example.entity.UserCredentialsBO;

public interface UserService {
    public UserCredentialsBO validateuserdetails(UserCredentialsDto loginRequest);

}
