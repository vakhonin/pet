package com.example.pet.controllers;

import com.example.pet.entities.Employee;
import com.example.pet.services.EmployeeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

  private EmployeeService employeeService;

  @Autowired
  public EmployeeController(EmployeeService employeeService) {
    this.employeeService = employeeService;
  }

  @PostMapping(path = "/new")
  public Employee create(@RequestBody Employee employee) {
    return employeeService.createNewEmployee(employee);
  }

  @GetMapping(path = "/all")
  public List<Employee> getAll() {
    System.out.println(employeeService.getAll());
    return employeeService.getAll();
  }

  @PutMapping(path = "/")
  public void update(@RequestBody Long employeeId, @RequestBody Long companyId) {
    employeeService.update(employeeId, companyId);

  }
}
