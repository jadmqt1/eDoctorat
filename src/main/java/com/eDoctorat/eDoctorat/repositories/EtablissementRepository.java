package com.eDoctorat.eDoctorat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eDoctorat.eDoctorat.models.Etablissement;

@Repository
public interface EtablissementRepository extends JpaRepository<Etablissement, Long> {
  
}