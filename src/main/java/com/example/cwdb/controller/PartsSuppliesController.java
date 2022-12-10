package com.example.cwdb.controller;

import com.example.cwdb.entity.PartsSuppliesEntity;
import com.example.cwdb.model.PartsSuppliesWithPartsName;
import com.example.cwdb.service.PartsSuppliesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/parts-supplies")
public class PartsSuppliesController {
  @Autowired
  private final PartsSuppliesService partsSuppliesService;

  public PartsSuppliesController(PartsSuppliesService partsSuppliesService) {
    this.partsSuppliesService = partsSuppliesService;
  }

  @GetMapping
  public String findAllPartsSupplies(Model model) {
    List<PartsSuppliesEntity> partsSupplies = partsSuppliesService.findAllPartsSupplies();
    model.addAttribute("parts_supplies", partsSupplies);
    return "parts-supplies";
  }

  @GetMapping("/task3")
  public String runTask3(Model model) {
    List<PartsSuppliesEntity> task3 = partsSuppliesService.runTask3();
    model.addAttribute("task3_res", task3);
    return "task3";
  }

  @GetMapping("/task1")
  public String runTask1(Model model, @RequestParam(value = "date", defaultValue = "2021-01-01")
  String date) {
    List<PartsSuppliesWithPartsName> task1 = partsSuppliesService.runTask1(date)
            .stream()
            .map(PartsSuppliesWithPartsName::fromEntity)
            .toList();
    model.addAttribute("task1_res", task1);
    return "task1";
  }
}
