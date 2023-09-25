package com.example.controller;

import com.example.dto.UserCredentialsDto;
import com.example.entity.UserBO;
import com.example.service.Impl.UserserviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/security")
public class SecurityController {

    @Autowired
    private UserserviceImpl userService;

    @PostMapping("/login")
    public UserBO postUserDetails(UserCredentialsDto userCredentialsDto) {
        return null;
    }


}
