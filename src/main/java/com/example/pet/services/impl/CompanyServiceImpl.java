package com.example.pet.services.impl;

import com.example.pet.entities.Company;
import com.example.pet.repositories.CompanyRepository;
import com.example.pet.services.CompanyService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CompanyServiceImpl implements CompanyService {

  private CompanyRepository companyRepository;

  @Autowired
  public CompanyServiceImpl(CompanyRepository companyRepository) {
    this.companyRepository = companyRepository;
  }

  @Transactional
  @Override
  public Company createNewCompany(Company company) {
    return companyRepository.save(company);
  }

  @Transactional
  @Override
  public List<Company> getAll() {
    return companyRepository.findAll();
  }

  @Transactional
  @Override
  public Company getById(Long id) {
    return companyRepository.findById(id).get();
  }

  @Transactional
  @Override
  public void deleteById(Long id) {
    companyRepository.deleteById(id);
  }

  @Transactional
  @Override
  public void updateById(Long id) {
    Company company = companyRepository.findById(id).get();
    company.setTitle("title has updated!");
    companyRepository.save(company);
  }

}
