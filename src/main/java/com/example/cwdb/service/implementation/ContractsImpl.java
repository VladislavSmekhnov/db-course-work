package com.example.cwdb.service.implementation;

import com.example.cwdb.entity.ContractsEntity;
import com.example.cwdb.repository.ContractsRepository;
import com.example.cwdb.service.ContractsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractsImpl implements ContractsService {
  private final ContractsRepository contractsRepository;

  @Autowired
  public ContractsImpl(ContractsRepository contractsRepository) {
    this.contractsRepository = contractsRepository;
  }

  @Override
  public List<ContractsEntity> findAllContracts() {
    return contractsRepository.findAll();
  }
}
