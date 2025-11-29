package com.tap.daoimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.tap.dao.EmployeeDao;
import com.tap.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

    // Update these values to match your local DB
    private static final String URL = "jdbc:mysql://localhost:3306/course_db?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "root";

    private static final String INSERT_QUERY =
        "INSERT INTO employee(name,email,contact,course,comments) VALUES(?,?,?,?,?)";

    @Override
    public int addEmployee(Employee emp) {
        int result = 0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection con = DriverManager.getConnection(URL, USER, PASS);
                 PreparedStatement ps = con.prepareStatement(INSERT_QUERY)) {

                ps.setString(1, emp.getName());
                ps.setString(2, emp.getEmail());
                ps.setString(3, emp.getContact());
                ps.setString(4, emp.getCourse());
                ps.setString(5, emp.getComments());

                result = ps.executeUpdate();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
