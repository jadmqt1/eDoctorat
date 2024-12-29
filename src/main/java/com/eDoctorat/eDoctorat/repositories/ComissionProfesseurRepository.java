package com.eDoctorat.eDoctorat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eDoctorat.hellowoeld.models.ComissionProfesseur;

@Repository
public interface ComissionProfesseurRepository extends JpaRepository<ComissionProfesseur, Long> {
  
}
