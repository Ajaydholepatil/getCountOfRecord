package com.emp.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAO {
    private final JdbcTemplate jdbcTemplate;

    public EmployeeDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void getNoOfEmployees(int employeeNo) {

        String SQL_NO_OF_EMPLOYEE = "SELECT count(*) FROM EMPLOYEE where EmpId=?";
        int count=jdbcTemplate.queryForObject(SQL_NO_OF_EMPLOYEE,Integer.class,new Object[]{employeeNo});

        System.out.println("Total No of Employees: "+count);
    }

}
