package com.example.repository;

import com.example.entity.UserDetailsBO;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserDetailsRepository extends CrudRepository<UserDetailsBO,Integer> {
    Optional<UserDetailsBO> findByUsernameIgnoreCase(String username);
}
