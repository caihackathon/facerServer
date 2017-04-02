package com.facerServer.cmd;

import java.util.List;

import com.facerServer.dao.ApplicationDao;
import com.facerServer.dao.ComponentDao;
import com.facerServer.dao.IncidentDao;
import com.facerServer.model.Incident;
import com.facerServer.model.StdApplication;
import com.facerServer.model.StdComponent;

public class Main {

	public static void main(String[] args) {

//		ApplicationDao.create(5,"TEST");
		
//		ApplicationDao.update(4, "IRIS");
		
		System.out.println("=== Applications ===");

    	ApplicationDao dao = new ApplicationDao();
		
		List<StdApplication> apps = dao.readAll();
		if (apps != null) {
			for (StdApplication app : apps) {
				System.out.println(app.getApplicationId() 
						+ " - " + app.getApplicationName()
						+ " - " + app.getApplicationActive()
						);
			}
		}

		System.out.println("=== Components ===");
		List<StdComponent> comps = ComponentDao.readAll();
		if (comps != null) {
			for (StdComponent comp : comps ) {
				System.out.println(comp.getComponentId()
							+ " - " + comp.getApplicationName()
							+ " - " + comp.getComponentName()
							+ " - " + comp.getComponentActive()
							);
			}
		}
		
		System.out.println("=== Incidents ===");
		List<Incident> incidents = IncidentDao.readAll();
		if (incidents != null) {
			for (Incident inc : incidents ) {
				System.out.println( inc.getIncidentId()
						+ " - " + inc.getStdIncidentType().getIncidentTypeName()
						+ " - " + inc.getStdSeverity().getSeverityName() 
						+ " - " + inc.getIncidentDate().toString()
//						+ " - " + inc.getIncidentResolvedDate()..toString()
						);
			}
		}
	}
}