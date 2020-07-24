package com.jdbc.secondJdbcApp.repository;


import com.jdbc.secondJdbcApp.mapper.EmployeeMapper;
import com.jdbc.secondJdbcApp.mapper.ResultSetExtractor;
import com.jdbc.secondJdbcApp.model.Employee;
import com.jdbc.secondJdbcApp.model.Employee1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.beans.BeanProperty;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {


    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insertToEmployee(Employee employee) {

        String query = "insert into employee(name,age,salary,commission) values(?,?,?,?)";

        int i = jdbcTemplate.update(query, new Object[]{employee.getAge(), employee.getSalary(), employee.getCommission()});

        System.out.println("RECORD INSERTED........" + i);
    }

    public List<Employee> getAllDataByBeanPro() {

        String query = "select * from employee";

        List<Employee> employeeList = jdbcTemplate.query(query, new BeanPropertyRowMapper<>(Employee.class));

        return employeeList;
    }

    public List<Employee1> getAllDataByRowMapper() {
        String query = "select * from employee";

        List<Employee1> employeeList = jdbcTemplate.query(query, new EmployeeMapper() {

        });

        return employeeList;
    }

    public List<Employee1> getAllDataByResultSetExtractor() {

        String query = "select * from employee";

        List<Employee1> employeeList = jdbcTemplate.query(query, new ResultSetExtractor());
        {

            return employeeList;


        }

    }

}
