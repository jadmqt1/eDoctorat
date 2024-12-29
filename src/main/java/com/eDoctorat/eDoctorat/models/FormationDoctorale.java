package com.eDoctorat.eDoctorat.models;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;



@Entity() 
@Data 
public class FormationDoctorale {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String nomLaboratoire;
  private String pathImage;
  private String initial;
  private String titre;
  private Date dateAccreditation;
  private String ced_id;
  private String etablissement_id;

}


