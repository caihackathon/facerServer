package com.facerServer.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.StoredProcedureQuery;

import com.facerServer.model.Incident;

public class IncidentDao {

	private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("facerServer");

	public static List<Incident> readActive() {
		
		List<Incident> incidents = null;
		
		// Create an EntityManager
		EntityManager manager = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction transaction = null;
		
		try {
			// Get a transaction
			transaction = manager.getTransaction();
			
			// Begin the transaction
			transaction.begin();
			
			// Get a list of Applications
			incidents = manager.createQuery("SELECT a FROM Incident a WHERE a.incidentResolvedDate IS NULL ", Incident.class).getResultList();
	
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
		return incidents;
	}

	public static List<Incident> readAll() {
		
		List<Incident> incidents = null;
		
		// Create an EntityManager
		EntityManager manager = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction transaction = null;
		
		try {
			// Get a transaction
			transaction = manager.getTransaction();
			
			// Begin the transaction
			transaction.begin();
			
			// Get a list of Applications
			incidents = manager.createQuery("SELECT a FROM Incident a ", Incident.class).getResultList();
	
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
		return incidents;
	}

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

}
