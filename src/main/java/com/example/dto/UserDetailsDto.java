package com.example.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDetailsDto {
        private Integer id;
        private String firstName;
        private String lastName;
        private String email;
        private List<LookUpDto> roles;
}
