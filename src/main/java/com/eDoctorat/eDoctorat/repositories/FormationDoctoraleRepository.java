package com.eDoctorat.eDoctorat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eDoctorat.hellowoeld.models.FormationDoctorale;

@Repository
public interface FormationDoctoraleRepository extends JpaRepository<FormationDoctorale, Long> {
  
}
