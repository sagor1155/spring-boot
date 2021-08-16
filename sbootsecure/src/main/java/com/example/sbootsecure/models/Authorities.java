package com.example.sbootsecure.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Reference;

import javax.persistence.*;
import java.security.PrivateKey;

@Entity
@Table(name = "authorities", schema = "CRUD")
@Getter
@Setter
public class Authorities {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "username", length = 50, nullable = false)
    private String username;

    @Column(name = "authority", length = 50, nullable = false)
    private String authority;


}
