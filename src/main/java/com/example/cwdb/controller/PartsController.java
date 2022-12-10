package com.example.cwdb.controller;

import com.example.cwdb.entity.PartsEntity;
import com.example.cwdb.model.PartsWithTotalSum;
import com.example.cwdb.service.PartsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/parts")
public class PartsController {
  private final PartsService partsService;

  public PartsController(PartsService partsService) {
    this.partsService = partsService;
  }

  @GetMapping()
  public String findAllParts(Model model) {
    List<PartsEntity> parts = partsService.findAllParts();
    model.addAttribute("parts", parts);
    return "parts";
  }

  @GetMapping("/task2")
  public String runTask2(Model model) {
    List<PartsWithTotalSum> task2 = partsService.runTask2();
    model.addAttribute("task2_res", task2);
    return "task2";
  }
}
