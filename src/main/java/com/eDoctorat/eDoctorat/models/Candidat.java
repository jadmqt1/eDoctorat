package com.eDoctorat.eDoctorat.models;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@Data 
public class Candidat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 30)
    private String cne;

    @Column(nullable = false, length = 30)
    private String cin;

    @Column(nullable = true, length = 255)
    private String nomCandidatAr;

    @Column(nullable = true, length = 255)
    private String prenomCandidatAr;

    @Column(nullable = false,columnDefinition = "LONGTEXT")
    private String adresse;

    @Column(nullable = true,columnDefinition = "LONGTEXT")
    private String adresseAr;

    @Column(nullable = true, length = 20)
    private String sexe;

    @Column(nullable = false, length = 255)
    private String villeDeNaissance;

    @Column(nullable = true, length = 255)
    private String villeDeNaissanceAr;

    @Column(nullable = false, length = 255)
    private String ville;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dateDeNaissance;

    @Column(nullable = true,length = 30)
    private String typeDeHandicape;

    @Column(nullable = true,length = 255)
    private String academie;

    @Column(nullable = true,length = 30)
    private String telCandidat;

    @Column(nullable = true,length = 100)
    private String pathCv;

    @Column(nullable = true,length = 100)
    private String pathPhoto;

    @Column(nullable = true)
    private int etatDossier;

    @Column(nullable = true,length = 50)
    private String situationFamiliale;

    @ManyToOne
    @JoinColumn(name = "pays_id", nullable = false)
    private Pays pays;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    private User user;

    @Column(nullable = false)
    private Boolean fonctionnaire;

    @OneToMany(mappedBy = "candidat", cascade = CascadeType.ALL)
    private List<Diplome> diplomes;
  }
