package com.dao;

import com.model.utulisateur;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class main{
    public static void main(String[] args) {
        // Create the EntityManagerFactory
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");

        // Create the EntityManager
        EntityManager entityManager = factory.createEntityManager();

        try {
            // Create a user object
            utulisateur user = new utulisateur();
            user.setName("John Doe");

            // Start a transaction
            entityManager.getTransaction().begin();

            // Save the user object
            entityManager.persist(user);

            // Commit transaction
            entityManager.getTransaction().commit();
            System.out.println("Insteretion succesfull");
        } finally {
            entityManager.close();
            factory.close();
        }
    }
}