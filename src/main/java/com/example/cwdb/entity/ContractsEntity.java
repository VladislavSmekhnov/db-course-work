package com.example.cwdb.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "contracts", schema = "public", catalog = "kfu_course_work_db")
public class ContractsEntity {
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  @Column(name = "number")
  private Integer number;
  @Basic
  @Column(name = "supplier_code")
  private Integer supplierCode;
  @Basic
  @Column(name = "conclusion_date")
  private Timestamp conclusionDate;

  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public Integer getSupplierCode() {
    return supplierCode;
  }

  public void setSupplierCode(Integer supplierCode) {
    this.supplierCode = supplierCode;
  }

  public Timestamp getConclusionDate() {
    return conclusionDate;
  }

  public void setConclusionDate(Timestamp conclusionDate) {
    this.conclusionDate = conclusionDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ContractsEntity that = (ContractsEntity) o;
    return Objects.equals(number, that.number) && Objects.equals(supplierCode, that.supplierCode) && Objects.equals(conclusionDate, that.conclusionDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, supplierCode, conclusionDate);
  }
}
