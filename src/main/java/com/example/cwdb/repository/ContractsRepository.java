package com.example.cwdb.repository;

import com.example.cwdb.entity.ContractsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractsRepository extends JpaRepository<ContractsEntity, Integer> {
}
