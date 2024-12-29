package com.eDoctorat.eDoctorat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eDoctorat.eDoctorat.models.Ced;


@Repository
public interface CedRepository extends JpaRepository<Ced, Long> {
  
}
