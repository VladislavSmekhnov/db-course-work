package com.example.cwdb.model;

import com.example.cwdb.entity.PartsEntity;

public class PartsWithTotalSum extends PartsEntity {
  private int totalSum;

  public PartsWithTotalSum() {}

  public int getTotalSum() {
    return totalSum;
  }

  public void setTotalSum(int totalSum) {
    this.totalSum = totalSum;
  }

  public static PartsWithTotalSum fromEntity(PartsEntity parts, int totalSum) {
    PartsWithTotalSum resTotalSum = new PartsWithTotalSum();
    resTotalSum.setCode(parts.getCode());
    resTotalSum.setMeasure(parts.getMeasure());
    resTotalSum.setName(parts.getName());
    resTotalSum.setType(parts.getType());
    resTotalSum.setTargetPrice(parts.getTargetPrice());
    resTotalSum.setTotalSum(totalSum);
    return resTotalSum;
  }
}
