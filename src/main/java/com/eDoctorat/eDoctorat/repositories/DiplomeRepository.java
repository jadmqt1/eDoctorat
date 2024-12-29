package com.eDoctorat.eDoctorat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eDoctorat.eDoctorat.models.Diplome;

@Repository
public interface DiplomeRepository extends JpaRepository<Diplome, Long> {
  
}