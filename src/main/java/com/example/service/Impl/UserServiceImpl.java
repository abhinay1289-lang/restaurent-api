package com.example.service.Impl;

import com.example.dto.request.LoginDto;
import com.example.entity.UserDetailsBO;
import com.example.exception.InvalidCredentialsException;
import com.example.repository.UserDetailsRepository;
import com.example.service.UserService;
import org.dozer.DozerBeanMapper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.function.Supplier;

@Service
public class UserServiceImpl implements UserService {

    private UserDetailsRepository userDetailsRepository;


    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public UserServiceImpl(UserDetailsRepository userDetailsRepository) {
        this.userDetailsRepository = userDetailsRepository;
    }

    @Override
    @Deprecated
    public UserDetailsBO validateUserCredentials(LoginDto loginRequest) {
        Supplier<InvalidCredentialsException> expSupplier =
                () ->
                        new InvalidCredentialsException(
                                String.format("The requested user %s not found", loginRequest.getUsername()));
        UserDetailsBO userCredentials =
                userDetailsRepository
                        .findByUsernameIgnoreCase(loginRequest.getUsername())
                        .orElseThrow(expSupplier);
        boolean isValid = encoder.matches(loginRequest.getPassword(), userCredentials.getPassword());
        if (!isValid) throw new InvalidCredentialsException("Invalid Credentials");


        return userDetailsRepository
                .findByUsernameIgnoreCase(loginRequest.getUsername())
                .orElseThrow(expSupplier);
    }

}

