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
public class laboratoire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomLaboratoire;
    private String description;
    private String pathImage;
    private String initial;
    private String ced_id;
    private String directeur_id;
    private String etablissement_id;




}
