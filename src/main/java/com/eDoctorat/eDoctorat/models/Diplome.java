package com.eDoctorat.eDoctorat.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data 
public class Diplome {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String intituler;
    private String type;
    private String dateCommission;
    private String mention;
    private String pays;
    private String etablissement;
    private String specialite;
    private String ville;
    private String province;
    private Double moyen_generale;

    @ManyToOne
    @JoinColumn(name = "candidat_id")
    private Candidat candidat;

    @OneToMany(mappedBy = "diplome", cascade = CascadeType.ALL)
    private List<Annexe> annexes;
    

}
