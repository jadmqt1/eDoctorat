package com.eDoctorat.eDoctorat.models;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data // Lombok annotation for generating getters, setters, and toString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "id")
    private Candidat candidat;

    private long id;
    private String username;
    private String password;
    private boolean is_superUser; 
    private String first_name; 
    private String last_name; 
    private String email;
    private boolean is_staff; 
    private boolean is_active; 
    private Date date_joined; 
}
