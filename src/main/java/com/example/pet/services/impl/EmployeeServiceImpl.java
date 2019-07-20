package com.example.pet.services.impl;

import com.example.pet.entities.Company;
import com.example.pet.repositories.EmployeeRepository;
import com.example.pet.entities.Employee;
import com.example.pet.services.EmployeeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

  private EmployeeRepository employeeRepository;

  @Autowired
  public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
    this.employeeRepository = employeeRepository;
  }

  @Transactional
  @Override
  public Employee createNewEmployee(Employee employee) {
    return employeeRepository.save(employee);
  }

  @Transactional
  @Override
  public List<Employee> getAll() {
    return employeeRepository.findAll();
  }

  @Transactional
  @Override
  public void update(Long employeeId, Long companyId) {
    Employee e = employeeRepository.findById(employeeId).get();
    e.setFirstName("FIRST NAME HAS UPDATED");
    employeeRepository.save(e);
  }
}
