package com.eDoctorat.eDoctorat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eDoctorat.eDoctorat.models.Inscription;

@Repository
public interface InscriptionRepository extends JpaRepository<Inscription, Long> {
  
}