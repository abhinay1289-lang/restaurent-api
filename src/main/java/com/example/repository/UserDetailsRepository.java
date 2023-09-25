package com.example.repository;

import com.example.entity.UserBO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepository extends JpaRepository<UserBO,Integer> {
}
