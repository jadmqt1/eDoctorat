package com.eDoctorat.eDoctorat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eDoctorat.hellowoeld.models.Calendrier;

@Repository
public interface CalendrierRepository extends JpaRepository<Calendrier, Long> {
  
}