package com.eDoctorat.eDoctorat.models;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data 
public class Inscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public Date dateDisposeDossier;
    public String remarque;
    public boolean valider;
  
    @ManyToOne
    @JoinColumn(name = "candidat_id", nullable = false)
    private Candidat candidat_inscription;

    @ManyToOne
    @JoinColumn(name = "sujet_id", nullable = false)
    public Sujet sujet;
}
