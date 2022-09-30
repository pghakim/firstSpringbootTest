package com.example.springTest.controller;


import com.example.springTest.model.Employee;
import com.example.springTest.service.employeeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EmployeeController {

  @Autowired
  RestTemplate restTemplate;

  @Autowired
  employeeService empService;


  @GetMapping(path = "/employeelist")
  public List<Employee> getEmployees() {

    // ResponseEntity<List<Employee>> response = restTemplate.getForEntity();

    return empService.getAllEmployees();
  }

  @GetMapping(path = "/employeelist/{id}")
  public Object getEmployee(@PathVariable int id) {
    return empService.getEmployee(id);
  }

  @PostMapping(path = "/employeelist", consumes = "application/json")
  @ResponseBody
  public int postEmployee(@RequestBody Employee emp) {
    System.out.println("posting...");
    return empService.postEmployee(emp);
  }

  @PutMapping("/employeelist/{id}")
  public int updateUser(@RequestBody Employee emp, @PathVariable int id) {
    return empService.updateEmployee(emp, id);
  }

  @DeleteMapping("/employeelist/{firstName}/{id}")
  public Object deleteUser(@PathVariable String firstName, @PathVariable int id) {
    return empService.deleteEmployee(firstName, id);
  }

}