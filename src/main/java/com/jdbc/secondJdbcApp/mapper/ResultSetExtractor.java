package com.jdbc.secondJdbcApp.mapper;

import com.jdbc.secondJdbcApp.model.Employee1;
import org.springframework.dao.DataAccessException;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ResultSetExtractor implements org.springframework.jdbc.core.ResultSetExtractor <List<Employee1>>{
    @Override
    public List<Employee1> extractData(ResultSet resultSet) throws SQLException, DataAccessException {

        List<Employee1> employeeList = new ArrayList<>();

        while (resultSet.next()) {
            Employee1 e = new Employee1();

            e.setEid(resultSet.getInt(1));
            e.setEname(resultSet.getString(2) + "  shaikh aj");
            e.setEage(resultSet.getInt(3));
            e.setEsalary(resultSet.getInt(4));
            e.setEcommission(resultSet.getInt(5));

            employeeList.add(e);

        }
        return employeeList;
    }
}
