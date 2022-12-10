package com.example.cwdb.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "parts", schema = "public", catalog = "kfu_course_work_db")
public class PartsEntity {
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  @Column(name = "code")
  private Integer code;
  @Basic
  @Column(name = "type")
  private String type;
  @Basic
  @Column(name = "name")
  private String name;
  @Basic
  @Column(name = "measure")
  private String measure;
  @Basic
  @Column(name = "target_price")
  private BigDecimal targetPrice;

  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getMeasure() {
    return measure;
  }

  public void setMeasure(String measure) {
    this.measure = measure;
  }

  public BigDecimal getTargetPrice() {
    return targetPrice;
  }

  public void setTargetPrice(BigDecimal targetPrice) {
    this.targetPrice = targetPrice;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PartsEntity that = (PartsEntity) o;
    return Objects.equals(code, that.code) && Objects.equals(type, that.type) && Objects.equals(name, that.name) && Objects.equals(measure, that.measure) && Objects.equals(targetPrice, that.targetPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, type, name, measure, targetPrice);
  }
}
