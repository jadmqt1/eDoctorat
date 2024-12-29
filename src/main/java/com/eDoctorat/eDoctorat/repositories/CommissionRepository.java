package com.eDoctorat.eDoctorat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eDoctorat.hellowoeld.models.Commission;

@Repository
public interface CommissionRepository extends JpaRepository<Commission, Long> {
  
}
