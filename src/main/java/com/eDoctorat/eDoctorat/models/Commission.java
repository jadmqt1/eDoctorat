package com.eDoctorat.eDoctorat.models;


import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;



@Entity() 
@Data 
public class Commission {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private Date dateCommission;
  private String lieu;
  private int heure;
  private int labo_id;

  


}


