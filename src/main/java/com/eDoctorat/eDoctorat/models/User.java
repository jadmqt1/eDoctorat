package com.eDoctorat.eDoctorat.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@Data
public class User {

  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 128)
    private String password;

    @Column(name = "last_login", nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date last_login;

    @Column(name = "is_superuser", nullable = false)
    private boolean is_superuser;

    @Column(nullable = false, length = 150)
    private String username;

    @Column(name = "first_name", nullable = false, length = 150)
    private String first_name;

    @Column(name = "last_name", nullable = false, length = 150)
    private String last_name;

    @Column(nullable = false, length = 254)
    private String email;

    @Column(name = "is_staff", nullable = false)
    private boolean is_staff;

    @Column(name = "is_active", nullable = false)
    private boolean is_active;

    @Column(name = "date_joined", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date date_joined;

    @OneToOne(mappedBy = "user")
    private Candidat candidat;
}
