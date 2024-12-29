package com.eDoctorat.eDoctorat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eDoctorat.eDoctorat.models.Sujet;

@Repository
public interface SujetRepository extends JpaRepository<Sujet, Long> {
  
}