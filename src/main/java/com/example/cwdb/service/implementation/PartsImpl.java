package com.example.cwdb.service.implementation;

import com.example.cwdb.entity.PartsEntity;
import com.example.cwdb.model.PartsWithTotalSum;
import com.example.cwdb.repository.PartsRepository;
import com.example.cwdb.service.PartsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PartsImpl implements PartsService {
  private final PartsRepository partsRepository;

  @Autowired
  public PartsImpl(PartsRepository partsRepository) {
    this.partsRepository = partsRepository;
  }

  @Override
  public List<PartsEntity> findAllParts() {
    return partsRepository.findAll();
  }

  public List<PartsWithTotalSum> runTask2() {
    List<PartsEntity> entity = partsRepository.task2();
    List<Integer> sums = partsRepository.sumTask2();
    assert (entity.size() == sums.size());
    List<PartsWithTotalSum> resSum = new ArrayList<>();
    for (int i = 0; i < entity.size(); ++i) {
      PartsWithTotalSum obj = PartsWithTotalSum.fromEntity(entity.get(i), sums.get(i));
      resSum.add(obj);
    }
    return resSum;
//    return partsRepository.task2();
  }
}
