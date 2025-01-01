package com.eDoctorat.eDoctorat.models;

<<<<<<< HEAD
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
=======

>>>>>>> 05e06f2da77a258ec02617e7adb161694164b7e7
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;



@Entity() 
@Data 
public class Professeur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = true, length = 30)
    private String cin;

    @Column(name = "telProfesseur", nullable = true, length = 30)
    private String telProfesseur;

    @Column(name = "pathPhoto", nullable = true, length = 200)
    private String pathPhoto;

    @Column(nullable = true, length = 10)
    private String grade;

    @Column(name = "numSOM", nullable = true, length = 50)
    private String numSOM;

    @Column(name = "nombreEncadrer", nullable = false)
    private int nombreEncadrer;

    @Column(name = "nombreProposer", nullable = false)
    private int nombreProposer;

    @ManyToOne
    @JoinColumn(name = "etablissement_id", nullable = false)
    private Etablissement etablissement;

    @ManyToOne
    @JoinColumn(name = "labo_id", nullable = true)
    private Laboratoire labo;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @OneToOne(mappedBy = "professeur", cascade = CascadeType.ALL)
    private Ced ced;
}


