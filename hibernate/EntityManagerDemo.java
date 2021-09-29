package com.revature.app;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.revature.app.model.Department;

public class EntityManagerDemo {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("learndb");
        EntityManager em = factory.createEntityManager();
        
        em.getTransaction().begin();
        
        List<Department> departmentList = 
                em.createQuery("from Department", Department.class).getResultList();
        
        departmentList.forEach(System.out::println);
        
        em.getTransaction().commit();
    }
}
