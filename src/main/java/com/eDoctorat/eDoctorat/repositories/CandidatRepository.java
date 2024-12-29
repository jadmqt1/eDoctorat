package com.eDoctorat.eDoctorat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eDoctorat.eDoctorat.models.Candidat;

@Repository
public interface CandidatRepository extends JpaRepository<Candidat, Long> {
  
}
