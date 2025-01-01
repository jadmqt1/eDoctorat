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
public class Laboratoire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomLaboratoire;
    private String description;
    private String pathImage;
    private String initial;
    private String ced_id;
    private String directeur_id;


    @ManyToOne
    @JoinColumn(name = "etablissement_id", nullable = false)
    private Etablissement etablissement;

    @OneToMany(mappedBy = "laboratoire", cascade = CascadeType.ALL)
    private List<Professeur> professeurs;
}
