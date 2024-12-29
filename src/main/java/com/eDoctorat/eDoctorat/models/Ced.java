package com.eDoctorat.eDoctorat.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;



@Entity() 
@Data 
public class Ced {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String description;
  private String pathImage;
  private String initiale;
  private String titre;
  private String directeur_id;

}


