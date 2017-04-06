package com.facerServer.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.facerServer.model.UserLogin;

public class UserLoginDao {

	private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("facerServer");

	public static List<UserLogin> readByUserId() {
		
		List<UserLogin> users = null;
		
		// Create an EntityManager
		EntityManager manager = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction transaction = null;
		
		try {
			// Get a transaction
			transaction = manager.getTransaction();
			
			// Begin the transaction
			transaction.begin();
			
			// Get a list of Applications
			users = manager.createNamedQuery("UserLogin.findByUserId", UserLogin.class).getResultList();
	
			// Commit the transaction
			transaction.commit();
		} catch(Exception ex) {
			// Roll back the changes
			if (transaction != null) {
				transaction.rollback();
			}
			// Print the exception
			ex.printStackTrace();
		} finally {
			// Close the EntityManager
			manager.close();
		}
		return users;
	}

	public static List<UserLogin> readByLastName() {
		
		List<UserLogin> users = null;
		
		// Create an EntityManager
		EntityManager manager = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction transaction = null;
		
		try {
			// Get a transaction
			transaction = manager.getTransaction();
			
			// Begin the transaction
			transaction.begin();
			
			// Get a list of Applications
			users = manager.createNamedQuery("UserLogin.findbyLastName", UserLogin.class).getResultList();
	
			// Commit the transaction
			transaction.commit();
		} catch(Exception ex) {
			// Roll back the changes
			if (transaction != null) {
				transaction.rollback();
			}
			// Print the exception
			ex.printStackTrace();
		} finally {
			// Close the EntityManager
			manager.close();
		}
		return users;
	}

	/*
	public static void updateIncidentResolved(int id) {
		
		// Create an EntityManager
		EntityManager manager = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction transaction = null;

		try {
			// Get a transaction
			transaction = manager.getTransaction();
			
			// Begin the transaction
			transaction.begin();

			// Update the record
			StoredProcedureQuery query = manager.createNamedStoredProcedureQuery("incidentResolved");
			query.setParameter("id", id);
			query.execute();
			
			// Save the application
//			manager.persist();
			
			// Commit the transaction
			transaction.commit();			
 		} catch(Exception ex) {
			// Roll back the changes
			if (transaction != null) {
				transaction.rollback();
			}
			// Print the exception
			ex.printStackTrace();
		} finally {
			// Close the EntityManager
			manager.close();
		}
	}
	*/

}
