package com.example.controller;

import com.example.dto.request.LoginDto;
import com.example.entity.UserDetailsBO;
import com.example.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/security")
public class SecurityController {
    private UserService userService;

    public SecurityController(UserService userService) {
        this.userService = userService;
    }
    @Deprecated
    @PostMapping("/login")
    public UserDetailsBO login(@RequestBody LoginDto loginDto){
        return userService.validateUserCredentials(loginDto);
    }
}