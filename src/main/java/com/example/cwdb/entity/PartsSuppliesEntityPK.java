package com.example.cwdb.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Objects;

public class PartsSuppliesEntityPK implements Serializable {
  @Column(name = "contract_number")
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer contractNumber;
  @Column(name = "part_code")
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer partCode;

  public Integer getContractNumber() {
    return contractNumber;
  }

  public void setContractNumber(Integer contractNumber) {
    this.contractNumber = contractNumber;
  }

  public Integer getPartCode() {
    return partCode;
  }

  public void setPartCode(Integer partCode) {
    this.partCode = partCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PartsSuppliesEntityPK that = (PartsSuppliesEntityPK) o;
    return Objects.equals(contractNumber, that.contractNumber) && Objects.equals(partCode, that.partCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractNumber, partCode);
  }
}
