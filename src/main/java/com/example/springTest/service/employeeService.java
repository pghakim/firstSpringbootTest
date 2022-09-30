package com.example.springTest.service;

import com.example.springTest.model.Employee;


import java.util.List;

public interface employeeService {

    public List<Employee> getAllEmployees();
    public Object getEmployee(int id);
    public int postEmployee(Employee emp);
    public int updateEmployee(Employee emp, int id);
    public Object deleteEmployee(String firstName, int id);

}
