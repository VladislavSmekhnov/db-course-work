package com.example.cwdb.model;

import com.example.cwdb.entity.PartsSuppliesEntity;

public class PartsSuppliesWithPartsName extends PartsSuppliesEntity {
  private String partName;

  public String getPartName() {
    return partName;
  }

  public void setPartName(String partName) {
    this.partName = partName;
  }

  public static PartsSuppliesWithPartsName fromEntity(PartsSuppliesEntity ps) {
    PartsSuppliesWithPartsName res = new PartsSuppliesWithPartsName();

    res.setPartName(ps.getPartsByPartCode().getName());
    res.setContractNumber(ps.getContractNumber());
    res.setContractPrice(ps.getContractPrice());
    res.setMeasure(ps.getMeasure());
    res.setPartsByPartCode(ps.getPartsByPartCode());
    res.setPartCode(ps.getPartCode());
    res.setDeliveryStartDate(ps.getDeliveryStartDate());
    res.setDeliveryEndDate(ps.getDeliveryEndDate());
    res.setDeliveryPlan(ps.getDeliveryPlan());

    return res;
  }
}
