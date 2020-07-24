package com.jdbc.secondJdbcApp.service;

import com.jdbc.secondJdbcApp.model.Employee;
import com.jdbc.secondJdbcApp.model.Employee1;
import com.jdbc.secondJdbcApp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public void insertToEmployee(Employee employee) {
        employeeRepository.insertToEmployee(employee);
    }


    public List<Employee> getAllDataByBeanPro() {
       return employeeRepository.getAllDataByBeanPro();
    }

    public List<Employee1> getAllDataByRowMapper(){
        return employeeRepository.getAllDataByRowMapper();
    }

    public List<Employee1> getAllDataByResultSetExtractor(){
        return employeeRepository.getAllDataByResultSetExtractor();
    }
}
