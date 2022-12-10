package com.example.cwdb.repository;

import com.example.cwdb.entity.PartsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PartsRepository extends JpaRepository<PartsEntity, Integer> {
  @Query(value = "SELECT (SUM(parts_supplies.contract_price) * parts_supplies.delivery_plan) AS Total" +
          " FROM parts INNER JOIN parts_supplies" +
          " ON parts.code = parts_supplies.part_code" +
          " AND EXTRACT(YEAR FROM parts_supplies.delivery_start_date) = EXTRACT(YEAR FROM current_timestamp)" +
          " GROUP BY parts.code, parts_supplies.delivery_plan, parts_supplies.contract_price;", nativeQuery = true)
  List<Integer> sumTask2();

  @Query(value = "SELECT parts.code, parts.name," +
          "    '' AS measure, null AS target_price, '' AS type" +
          "    FROM parts INNER JOIN parts_supplies" +
          "    ON parts.code = parts_supplies.part_code" +
          "    AND EXTRACT(YEAR FROM parts_supplies.delivery_start_date) = EXTRACT(YEAR FROM current_timestamp)" +
          "    GROUP BY parts.code, parts_supplies.delivery_plan, parts_supplies.contract_price;", nativeQuery = true)
  List<PartsEntity> task2();
}
