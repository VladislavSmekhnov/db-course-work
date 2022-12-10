package com.example.cwdb.service;

import com.example.cwdb.entity.PartsEntity;
import com.example.cwdb.model.PartsWithTotalSum;

import java.util.List;

public interface PartsService {
  List<PartsEntity> findAllParts();

  public List<PartsWithTotalSum> runTask2();
}
