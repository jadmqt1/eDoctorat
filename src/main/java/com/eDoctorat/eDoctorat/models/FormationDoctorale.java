package com.eDoctorat.eDoctorat.models;

import java.time.LocalDate;

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
public class FormationDoctorale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = true)
    private String pathImage;

    @Column(length = 255, nullable = true)
    private String initiale;

    @Column(length = 255, nullable = false)
    private String titre;

    @Column(columnDefinition = "LONGTEXT", nullable = true)
      private String axeDeRecherche ;

    @Column(nullable = true)
    private LocalDate dateAccreditation;

    @ManyToOne
    @JoinColumn(name = "ced_id", referencedColumnName = "id", nullable = true)
    private Ced ced;

    @ManyToOne
    @JoinColumn(name = "etablissement_id", referencedColumnName = "id", nullable = true)
    private Etablissement etablissement;
}

