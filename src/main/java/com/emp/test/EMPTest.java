package com.emp.test;

import com.emp.dao.EmployeeDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class EMPTest {
    public static void main(String[]args) throws SQLException {
        ApplicationContext context=new ClassPathXmlApplicationContext("application-context.xml");
        EmployeeDAO employeeDAO=context.getBean("employeeDAO",EmployeeDAO.class);
        employeeDAO.getNoOfEmployees(03);

    }

}
