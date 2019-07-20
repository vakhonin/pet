package com.example.pet.services;

import com.example.pet.entities.Employee;
import java.util.List;

public interface EmployeeService {
  Employee createNewEmployee(Employee employee);

  List<Employee> getAll();

  void update(Long employeeId, Long companyId);
}
