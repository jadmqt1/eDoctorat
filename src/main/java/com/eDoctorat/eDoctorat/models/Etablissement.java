package com.eDoctorat.eDoctorat.models;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data // Lombok annotation for generating getters, setters, and toString
public class Etablissement {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtablissement;
    private String nomEtablissement;
   
}
