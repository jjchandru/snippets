package com.revature.app.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.app.model.Customer;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        
        Customer customer = new Customer();
        if (email.equals("john@gmail.com") && password.equals("john123")) {
            customer.setId(1);
            customer.setName("John");
            customer.setEmail(email);
            customer.setPassword(password);
        }
        if (email.equals("smith@gmail.com") && password.equals("smith123")) {
            customer.setId(2);
            customer.setName("Smith");
            customer.setEmail(email);
            customer.setPassword(password);
        }
        
        resp.setContentType("text/html");
        resp.getWriter().write("Login Successful.");
        resp.getWriter().write("Welcome " + customer.getName());
    }

}
