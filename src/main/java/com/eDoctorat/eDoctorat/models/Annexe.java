package com.eDoctorat.eDoctorat.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data 
public class Annexe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private String pathFile;
    
    
      
    @ManyToOne
    @JoinColumn(name = "diplome_id")
    private Diplome diplome;

}