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
    private String moyen_generale;
    private String candidat_id;
    

}
