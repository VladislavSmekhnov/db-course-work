package com.example.cwdb.repository;

import com.example.cwdb.entity.PartsSuppliesEntity;
import com.example.cwdb.entity.PartsSuppliesEntityPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PartsSuppliesRepository extends JpaRepository<PartsSuppliesEntity, PartsSuppliesEntityPK> {
  @Query(value = "SELECT contract_number, part_code, parts_supplies.measure, delivery_start_date, delivery_end_date," +
          " delivery_plan, contract_price FROM parts_supplies" +
          " INNER JOIN parts ON parts.code = parts_supplies.part_code" +
          " AND parts.type = 'pur' AND parts_supplies.delivery_plan > 100;", nativeQuery = true)
  List<PartsSuppliesEntity> task3();

  @Query(value = "select parts_supplies.* FROM parts_supplies JOIN parts ON parts.code = parts_supplies.part_code" +
          " AND parts_supplies.delivery_start_date >= (:inputDate);", nativeQuery = true)
  List<PartsSuppliesEntity> task1(@Param("inputDate") LocalDate inputDate);
}
