package com.eDoctorat.eDoctorat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eDoctorat.eDoctorat.models.Annexe;



@Repository
public interface AnnexeRepository extends JpaRepository<Annexe, Long> {
  
}