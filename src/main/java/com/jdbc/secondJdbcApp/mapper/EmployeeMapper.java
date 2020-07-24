package com.jdbc.secondJdbcApp.mapper;

import com.jdbc.secondJdbcApp.model.Employee1;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeMapper implements RowMapper<Employee1> {
    @Override
    public Employee1 mapRow(ResultSet resultSet, int i) throws SQLException {

        Employee1 e = new Employee1();

        e.setEid(resultSet.getInt(1));
        e.setEname(resultSet.getString(2)+" Shaikh");
        e.setEage(resultSet.getInt(3));
        e.setEsalary(resultSet.getInt(4));
        e.setEcommission(resultSet.getInt(5));
        return e;

    }
}
