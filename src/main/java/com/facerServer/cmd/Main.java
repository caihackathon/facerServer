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
		
		System.out.println("=== Incidents - All ===");
		List<Incident> incAll = IncidentDao.readAll();
		if (incAll != null) {
			for (Incident inc : incAll ) {
				System.out.println( inc.getIncidentId()
						+ " - " + inc.getIncidentTypeName()
						+ " - " + inc.getSeverityName()
						+ " - " + inc.getIncidentTypeName()
						+ " - " + inc.getIncidentActive()
						);
			}
		}
	
		System.out.println("=== Incidents - Active ===");
		List<Incident> incActive = IncidentDao.readActive();
		if (incActive != null) {
			for (Incident inc : incActive ) {
				System.out.println( inc.getIncidentId()
						+ " - " + inc.getIncidentTypeName()
						+ " - " + inc.getSeverityName()
						+ " - " + inc.getIncidentTypeName()
						+ " - " + inc.getIncidentActive()
						);
			}
		}

	}
}