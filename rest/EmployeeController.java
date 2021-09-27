package com.revature.app.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.revature.app.AppException;
import com.revature.app.dao.EmployeeDao;
import com.revature.app.dao.impl.EmployeeDaoImpl;
import com.revature.app.model.Employee;

@Path("/employees")
public class EmployeeController {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(Employee employee) {
        EmployeeDao dao = new EmployeeDaoImpl();
        System.out.println("create employee");
        try {
            dao.create(employee);
            return Response.ok().build();
        } catch (AppException e) {
            return Response.status(500).build();
        }
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list() {
        EmployeeDao dao = new EmployeeDaoImpl();
        try {
            return Response.ok().entity(dao.list()).build();
        } catch (AppException e) {
            return Response.status(500).build();
        }
        
    }
}
