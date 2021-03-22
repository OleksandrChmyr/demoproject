package com.example.demoproject.entity;

import java.util.Objects;
import lombok.*;

import javax.persistence.*;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name")
    private String name;
//    private String firstName;
//    private String lastName;
//    private String email;
//    private Role role;







}
