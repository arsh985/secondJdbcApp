package com.jdbc.secondJdbcApp.controller;

import com.jdbc.secondJdbcApp.model.Employee;
import com.jdbc.secondJdbcApp.model.Employee1;
import com.jdbc.secondJdbcApp.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/emp")
public class EmployeeCtrl {

    @Autowired
    private EmployeeService employeeService;

    Logger logger = LoggerFactory.getLogger(EmployeeCtrl.class);

    @CrossOrigin(origins="http://localhost:4200")
    @GetMapping("get")
    public String  emp(){
        logger.trace("Tracing the info...");
        logger.debug("Debugging.....");
        logger.info("Informing...");
        logger.warn("Warning.....");
        logger.error("Error happened.....");
        return "Employeee is employee....";
    }

    @PostMapping("insert")
    public void insertToEmployee(@RequestBody Employee employee){

        employeeService.insertToEmployee(employee);

    }

    @GetMapping("select")
    public List<Employee> getAllDataByBeanPro(){
        return employeeService.getAllDataByBeanPro();
    }


    @GetMapping("row-mapper")
    public List<Employee1> getAllDataByRowMapper(){
        return employeeService.getAllDataByRowMapper();
    }

    @GetMapping("result-set")
    public List<Employee1> getAllDataByResultSetExtractor(){
        return employeeService.getAllDataByResultSetExtractor();
    }

}
