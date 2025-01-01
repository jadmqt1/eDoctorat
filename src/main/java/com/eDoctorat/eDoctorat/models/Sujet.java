package com.eDoctorat.eDoctorat.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Sujet {
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "titre", nullable = false, length = 255)
    private String titre;

    @Column(name = "description", nullable = true, columnDefinition = "TEXT")
    private String description;

    @Column(name = "publier", nullable = false)
    private Boolean publier;

    @ManyToOne
    @JoinColumn(name = "professeur_id", nullable = false)
    private Professeur professeur;

    @ManyToOne
    @JoinColumn(name = "coDirecteur_id", nullable = true)
    private Professeur coDirecteur;

    @ManyToOne
    @JoinColumn(name = "formationDoctorale_id", nullable = false)
    private FormationDoctorale formationDoctorale;


}