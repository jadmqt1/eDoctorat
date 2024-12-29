package com.eDoctorat.eDoctorat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eDoctorat.eDoctorat.models.Notification;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {
  
}
