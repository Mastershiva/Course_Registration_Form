package com.tap;

import java.io.IOException;

import com.tap.dao.EmployeeDao;
import com.tap.daoimpl.EmployeeDaoImpl;
import com.tap.model.Employee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String contact = req.getParameter("contact");
        String course = req.getParameter("course");
        String comments = req.getParameter("comments");

        Employee emp = new Employee(name, email, contact, course, comments);

        EmployeeDao dao = new EmployeeDaoImpl();
        int result = dao.addEmployee(emp);

        resp.setContentType("text/html");

        if (result > 0) {
            resp.getWriter().print("<h2>Hey " + name + ", your registration is successful!</h2>");
        } else {
            resp.getWriter().print("<h2>Hey " + name + ", registration failed. Try again!</h2>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.getWriter().println("<h3>Please use the registration form (POST)</h3>");
    }
}
