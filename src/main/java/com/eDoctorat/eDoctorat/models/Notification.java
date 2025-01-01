package com.eDoctorat.eDoctorat.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;



@Entity() 
@Data 
public class Notification {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String type;

  
    @ManyToOne
    @JoinColumn(name = "candidat_id", nullable = false)
    private Candidat candidat_notification;

    @ManyToOne
    @JoinColumn(name = "commission_id", nullable = false)
    public Comission commission_notification;

    @ManyToOne
    @JoinColumn(name = "sujet_id", nullable = false)
    public Sujet sujet_notification;




}


