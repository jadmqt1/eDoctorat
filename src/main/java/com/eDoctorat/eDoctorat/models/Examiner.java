package com.eDoctorat.eDoctorat.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;



@Entity() 
@Data 
public class Examiner {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String decision;
  private int noteDossier;
  private int noteEntretien;
  private boolean publier;
  private int commission_id;
  private int sujet_id;
  private int candidat_id;
  private int valider_id;

}


