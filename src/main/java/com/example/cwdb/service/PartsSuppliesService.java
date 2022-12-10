package com.example.cwdb.service;

import com.example.cwdb.entity.PartsSuppliesEntity;

import java.util.List;

public interface PartsSuppliesService {
  List<PartsSuppliesEntity> findAllPartsSupplies();

  public List<PartsSuppliesEntity> runTask3();

  public List<PartsSuppliesEntity> runTask1(String date);
}
