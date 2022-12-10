package com.example.cwdb.service.implementation;

import com.example.cwdb.entity.PartsSuppliesEntity;
import com.example.cwdb.repository.PartsSuppliesRepository;
import com.example.cwdb.service.PartsSuppliesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Service
public class PartsSuppliesImpl implements PartsSuppliesService {
  private final PartsSuppliesRepository partsSuppliesRepository;

  @Autowired
  public PartsSuppliesImpl(PartsSuppliesRepository partsSuppliesRepository) {
    this.partsSuppliesRepository = partsSuppliesRepository;
  }

  @Override
  public List<PartsSuppliesEntity> findAllPartsSupplies() {
    return partsSuppliesRepository.findAll();
  }

  public List<PartsSuppliesEntity> runTask3() {
    return partsSuppliesRepository.task3();
  }

  public List<PartsSuppliesEntity> runTask1(String date) {
    return partsSuppliesRepository.task1(LocalDate.parse(date));
  }
}
