package com.example.pet.controllers;

import com.example.pet.entities.Company;
import com.example.pet.services.CompanyService;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/company")
public class CompanyController {

  private CompanyService companyService;

  public CompanyController(CompanyService companyService) {
    this.companyService = companyService;
  }

  @PostMapping(path = "/new")
  public Company create(@RequestBody Company company) {
    return companyService.createNewCompany(company);
  }

  @GetMapping(path = "/all")
  public List<Company> getAll() {
    return companyService.getAll();
  }

  @GetMapping(path = "/one/{id}")
  public Company getAll(@PathVariable Long id) {
    return companyService.getById(id);
  }

  @DeleteMapping(path = "/{id}")
  public void delete(@PathVariable Long id) {
    companyService.deleteById(id);
  }

  @PutMapping(path = "/{id}")
  public void update(@PathVariable Long id) {
    companyService.updateById(id);
  }

}
