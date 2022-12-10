package com.example.cwdb.service;

import com.example.cwdb.entity.ContractsEntity;

import java.util.List;

public interface ContractsService {
  List<ContractsEntity> findAllContracts();
}
