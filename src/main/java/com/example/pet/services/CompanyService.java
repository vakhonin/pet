package com.example.pet.services;

import com.example.pet.entities.Company;
import java.util.List;

public interface CompanyService {
  Company createNewCompany(Company company);

  List<Company> getAll();

  Company getById(Long id);

  void deleteById(Long id);

  void updateById(Long id);


}
