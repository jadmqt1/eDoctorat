package com.eDoctorat.eDoctorat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eDoctorat.hellowoeld.models.Professeur;

@Repository
public interface ProfesseurRepository extends JpaRepository<Professeur, Long> {
  
}
