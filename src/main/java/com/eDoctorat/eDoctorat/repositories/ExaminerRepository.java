package com.eDoctorat.eDoctorat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eDoctorat.hellowoeld.models.Examiner;

@Repository
public interface ExaminerRepository extends JpaRepository<Examiner, Long> {
  
}
