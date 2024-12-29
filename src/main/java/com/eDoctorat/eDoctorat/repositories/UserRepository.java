package com.eDoctorat.eDoctorat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.eDoctorat.eDoctorat.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
