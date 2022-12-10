package com.example.cwdb.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "parts_supplies", schema = "public", catalog = "kfu_course_work_db")
@IdClass(PartsSuppliesEntityPK.class)
public class PartsSuppliesEntity {
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  @Column(name = "contract_number", insertable=false, updatable=false)
  private Integer contractNumber;
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  @Column(name = "part_code", insertable=false, updatable=false)
  private Integer partCode;
  @Basic
  @Column(name = "measure")
  private String measure;
  @Basic
  @Column(name = "delivery_start_date")
  private Date deliveryStartDate;
  @Basic
  @Column(name = "delivery_end_date")
  private Date deliveryEndDate;
  @Basic
  @Column(name = "delivery_plan")
  private Integer deliveryPlan;
  @Basic
  @Column(name = "contract_price")
  private BigDecimal contractPrice;
  @ManyToOne
  @JoinColumn(name = "contract_number", referencedColumnName = "number", nullable = false,
          insertable=false, updatable=false)
  @JsonIgnore
  private ContractsEntity contractsByContractNumber;
  @ManyToOne
  @JoinColumn(name = "part_code", referencedColumnName = "code", nullable = false,
          insertable=false, updatable=false)
  @JsonIgnore
  private PartsEntity partsByPartCode;

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

  public String getMeasure() {
    return measure;
  }

  public void setMeasure(String measure) {
    this.measure = measure;
  }

  public Date getDeliveryStartDate() {
    return deliveryStartDate;
  }

  public void setDeliveryStartDate(Date deliveryStartDate) {
    this.deliveryStartDate = deliveryStartDate;
  }

  public Date getDeliveryEndDate() {
    return deliveryEndDate;
  }

  public void setDeliveryEndDate(Date deliveryEndDate) {
    this.deliveryEndDate = deliveryEndDate;
  }

  public Integer getDeliveryPlan() {
    return deliveryPlan;
  }

  public void setDeliveryPlan(Integer deliveryPlan) {
    this.deliveryPlan = deliveryPlan;
  }

  public BigDecimal getContractPrice() {
    return contractPrice;
  }

  public void setContractPrice(BigDecimal contractPrice) {
    this.contractPrice = contractPrice;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PartsSuppliesEntity that = (PartsSuppliesEntity) o;
    return Objects.equals(contractNumber, that.contractNumber) && Objects.equals(partCode,
            that.partCode) && Objects.equals(measure, that.measure)
            && Objects.equals(deliveryStartDate, that.deliveryStartDate)
            && Objects.equals(deliveryEndDate, that.deliveryEndDate)
            && Objects.equals(deliveryPlan, that.deliveryPlan)
            && Objects.equals(contractPrice, that.contractPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractNumber, partCode, measure, deliveryStartDate, deliveryEndDate,
            deliveryPlan, contractPrice);
  }

  public ContractsEntity getContractsByContractNumber() {
    return contractsByContractNumber;
  }

  public void setContractsByContractNumber(ContractsEntity contractsByContractNumber) {
    this.contractsByContractNumber = contractsByContractNumber;
  }

  public PartsEntity getPartsByPartCode() {
    return partsByPartCode;
  }

  public void setPartsByPartCode(PartsEntity partsByPartCode) {
    this.partsByPartCode = partsByPartCode;
  }

  @Override
  public String toString() {
    return "PartsSuppliesEntity{" +
            "contractNumber=" + contractNumber +
            ", partCode=" + partCode +
            ", measure='" + measure + '\'' +
            ", deliveryStartDate=" + deliveryStartDate +
            ", deliveryEndDate=" + deliveryEndDate +
            ", deliveryPlan=" + deliveryPlan +
            ", contractPrice=" + contractPrice +
            '}';
  }
}
