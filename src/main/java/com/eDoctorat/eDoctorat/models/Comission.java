package com.eDoctorat.eDoctorat.models;


import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


import jakarta.persistence.*;
import java.time.LocalTime;
import java.util.List;

@Entity

@Data
public class Comission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Date dateComision;

    @Column(length = 255, nullable = false)
    private String lieu;

    @Column(nullable = false)
    private LocalTime heure;

    @ManyToOne
    @JoinColumn(name = "labo_id", nullable = false, referencedColumnName = "id")
    private Laboratoire laboratoire;

    @OneToMany(mappedBy = "comission")
    private List<ComissionProfesseur> comissionProfesseurs;
    
}
