package com.eDoctorat.eDoctorat.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;



@Entity() 
@Data 
public class Examiner {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "decision", nullable = true, length = 255)
    private String decision;

    @Column(name = "noteDossier", nullable = false)
    private Float noteDossier;

    @Column(name = "noteEntretien", nullable = false)
    private Integer noteEntretien;

    @Column(name = "publier", nullable = false)
    private Boolean publier;

    @ManyToOne
    @JoinColumn(name = "commission_id", referencedColumnName = "id", nullable = false)
    private Comission commission;



    @ManyToOne
    @JoinColumn(name = "sujet_id", nullable = false)
    private Sujet sujet;

    @ManyToOne
    @JoinColumn(name = "candidat_id", nullable = false)
    private Candidat candidat;



    @Column(name = "valider", nullable = false)
    private Boolean valider;

}


