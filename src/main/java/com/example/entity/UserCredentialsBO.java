package com.example.entity;

import jakarta.persistence.*;
import java.util.Date;
import lombok.Data;

@Entity
@Data
@Table(
        name = "user_credentials",
        uniqueConstraints = {@UniqueConstraint(columnNames = "username")})
public class UserCredentialsBO {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_credentials_id_generator")
    @SequenceGenerator(
            name = "user_credentials_id_generator",
            sequenceName = "user_credentials_id_seq",
            allocationSize = 1)
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "modified_on")
    private Date modifiedOn;
}
