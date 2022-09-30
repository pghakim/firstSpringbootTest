package com.example.springTest.dao;

import com.example.springTest.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class employeeDaoImpl implements employeeDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Employee> getEmployee() {
        String sql = "SELECT * FROM employeelist";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Employee>(Employee.class));
    }

    @Override
    public Object getEmployee(int id) {
        String sql = "SELECT * FROM employeelist WHERE id = ?";
        return jdbcTemplate.query(sql, new Object[]{id}, new BeanPropertyRowMapper(Employee.class));
    }


    //only gets work
    @Override
    public int postEmployee(Employee employee) {

        Employee emp = new Employee();
        //emp.setId(emp.getId());
        emp.setFirstName(emp.getFirstName());
        emp.setLastName(emp.getLastName());

        String sql = "INSERT INTO employeelist (firstName, lastName) VALUES (?, ?)";


        return jdbcTemplate.update(sql,emp.getFirstName(), emp.getLastName());

    }

    @Override
    public int updateEmployee(Employee employee, int id) {

        String sql = "UPDATE employeelist SET  firstName = ?, lastName = ?, WHERE id = ?";

        return jdbcTemplate.update(sql,  employee.getFirstName(), employee.getLastName(), id );

    }


    @Override
    public Object deleteEmployee(String firstname, int id) {
        String sql =  " DELETE FROM employeelist WHERE firstName = ?  and id = ? ";
        return  jdbcTemplate.update(sql, firstname, id);
    }
}
