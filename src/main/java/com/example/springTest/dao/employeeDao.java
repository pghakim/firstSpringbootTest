package com.example.springTest.dao;

import com.example.springTest.model.Employee;


import java.util.List;

public interface employeeDao {

    public List<Employee> getEmployee();
    public Object getEmployee(int id);
    public int postEmployee(Employee employee);
    public int updateEmployee(Employee employee, int id);
    public Object deleteEmployee(String firstname, int id);

}
