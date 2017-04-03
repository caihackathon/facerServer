package com.facerServer.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.facerServer.model.StdApplication;

public class ApplicationDao {

	private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("facerServer");

/*
	public static void create(int id, String name) {
		
		// Create an EntityManager
		EntityManager manager = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction transaction = null;

		try {
			// Get a transaction
			transaction = manager.getTransaction();
			
			// Begin the transaction
			transaction.begin();
			
			// Get a list of Applications
			StdApplication app = new StdApplication();
			app.setApplicationId(id);
			app.setApplicationName(name);
	

			// Save the application
			manager.persist(app);
			
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
	
	// ==================================================
	//     readAll - All Applications
	// ==================================================
	public static List<StdApplication> readAll() {
		
		List<StdApplication> apps = null;
		
		// Create an EntityManager
		EntityManager manager = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction transaction = null;
		
		try {
			// Get a transaction
			transaction = manager.getTransaction();
			
			// Begin the transaction
			transaction.begin();
			
			// Get a list of Applications
			apps = manager.createNamedQuery("StdApplication.findAll", StdApplication.class).getResultList();
	
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
		return apps;
	}

/*
	public static void update(int id, String name) {
		
		// Create an EntityManager
		EntityManager manager = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction transaction = null;

		try {
			// Get a transaction
			transaction = manager.getTransaction();
			
			// Begin the transaction
			transaction.begin();

			// Get a list of Applications
			StdApplication app = manager.find(StdApplication.class, id);
			
			// Update the record
			app.setApplicationName(name);;
			
			// Save the application
			manager.persist(app);
			
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

	public static void delete(int id) {
		
		// Create an EntityManager
		EntityManager manager = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction transaction = null;

		try {
			// Get a transaction
			transaction = manager.getTransaction();
			
			// Begin the transaction
			transaction.begin();

			// Get a list of Applications
			StdApplication app = manager.find(StdApplication.class, id);
			
			// Delete the record
			manager.remove(app);
			
			// Save the application
			manager.persist(app);
			
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
