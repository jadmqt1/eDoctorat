package com.eDoctorat.eDoctorat.models;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;



@Entity() 
@Data 
public class Professeur {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String cin;
  private long telProfesseur;
  private String lieu;
  private String pathPhoto;
  private String qrade;
  private int numSom;
  private int nombreProposer;
  private int etablissement_id;
  private int labo_id;
  private int user_id; 

}


