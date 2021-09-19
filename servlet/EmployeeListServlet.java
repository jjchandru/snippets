package com.revature.app.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.app.dao.EmployeeDao;
import com.revature.app.dao.impl.EmployeeDaoImpl;
import com.revature.app.model.Employee;

@WebServlet("/employees")
public class EmployeeListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        EmployeeDao dao = new EmployeeDaoImpl();
        try {
            List<Employee> employeeList = dao.list();
            StringBuffer buffer = new StringBuffer();
            buffer.append("<html>");
            buffer.append("<body>");
            buffer.append("<h1>Employees List</h1>");
            buffer.append("<table>");
            buffer.append("<tr>");
            buffer.append("<th>Name</th><th>Salary</th><th>Gender</th><th>Department</th>");
            buffer.append("</tr>");
            
            for (Employee employee : employeeList) {
                buffer.append("<tr>");
                buffer.append("<td>").append(employee.getName()).append("</td>");
                buffer.append("<td>").append(employee.getSalary()).append("</td>");
                buffer.append("<td>").append(employee.getGender()).append("</td>");
                buffer.append("<td>").append(employee.getDepartment().getName()).append("</td>");
                buffer.append("</tr>");
            }
            
            buffer.append("</table>");
            buffer.append("</body>");
            buffer.append("</html>");
            resp.getWriter().write(buffer.toString());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
