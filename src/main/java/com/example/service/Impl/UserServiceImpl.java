package com.example.service.Impl;

import com.example.entity.UserDetailsBO;
import com.example.repository.UserDetailsRepository;
import com.example.service.UserService;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDetailsRepository userDetailsRepository;
    @Autowired
    BCryptPasswordEncoder encoder;
    @Autowired
    DozerBeanMapper mapper;

    @Override
    public List<UserDetailsBO> getUsers() {
        return userDetailsRepository.findAll();
    }

}

