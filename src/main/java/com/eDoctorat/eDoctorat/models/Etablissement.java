package com.eDoctorat.eDoctorat.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data 
public class Etablissement {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtablissement;
    private String nomEtablissement;
   
    @OneToMany(mappedBy = "etablissement", cascade = CascadeType.ALL)
    private List<Laboratoire> laboratoires;

    @OneToMany(mappedBy = "etablissement", cascade = CascadeType.ALL)
    private List<Professeur> professeurs;
}
