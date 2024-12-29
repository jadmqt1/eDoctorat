package com.eDoctorat.eDoctorat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eDoctorat.eDoctorat.models.Laboratoire;


@Repository
public interface LaboratoireRepository extends JpaRepository<Laboratoire, Long> {
  
}