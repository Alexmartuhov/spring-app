package com.example.springapp.dao;

import com.example.springapp.dao.entities.DriverEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverDao extends JpaRepository<DriverEntity, Integer> {
}
