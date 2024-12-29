package com.eDoctorat.eDoctorat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eDoctorat.eDoctorat.models.Pays;

@Repository
public interface PaysRepository extends JpaRepository<Pays, Long> {
  
}
