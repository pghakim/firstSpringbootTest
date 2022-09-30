package com.example.springTest.service;

import com.example.springTest.dao.employeeDao;
import com.example.springTest.model.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class employeeServiceImpl implements employeeService {

    @Autowired
    com.example.springTest.dao.employeeDao employeeDao;


    @Override
    public List<Employee> getAllEmployees() {
        return employeeDao.getEmployee();
    }

    @Override
    public int postEmployee(Employee emp) {
        return  employeeDao.postEmployee(emp);
    }

    @Override
    public int updateEmployee(Employee emp, int id) {
        return employeeDao.updateEmployee(emp, id);
    }

    @Override
    public Object getEmployee(int id) {
        return employeeDao.getEmployee(id);
    }

    @Override
    public Object deleteEmployee(String firstName, int id) {
        return employeeDao.deleteEmployee(firstName, id);
    }
}
