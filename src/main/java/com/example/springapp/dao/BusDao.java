package com.example.springapp.dao;

import com.example.springapp.dao.entities.BusEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusDao extends JpaRepository<BusEntity, Integer> {
}
