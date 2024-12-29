package com.eDoctorat.eDoctorat.models;


import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;



@Entity() 
@Data 
public class Calendrier {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String action;
  private Date dateDebut;
  private Date dateFin;
  private String pour;

}


