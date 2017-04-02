package com.facerServer.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.facerServer.dao.ApplicationDao;
import com.facerServer.model.StdApplication;

@Path("applications")
public class ApplicationRest {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getText() {

    	List<StdApplication> appList = new ArrayList<StdApplication>();
    	
    	ApplicationDao dao = new ApplicationDao();
    	appList = dao.readAll();

    	String msg = new String();    	
    	
    	for (StdApplication app : appList) {
    		
    		msg = msg + app.getApplicationId() + " - " + app.getApplicationName() + "\n"; 
    		
    	}
    	
    	return msg;
    }

    @Path("html")
    @GET
    @Produces(MediaType.TEXT_HTML)
    public Response getHtml() {
    	String msg = new String();
    	msg = "<html> " + "<title>" + "Applications" + "</title><body><h2>Applications</h2>";

    	List<StdApplication> appList = new ArrayList<StdApplication>();

    	ApplicationDao dao = new ApplicationDao();
    	appList = dao.readAll();
  	
    	for (StdApplication app : appList) {
    		msg = msg + app.getApplicationId() + " - " + app.getApplicationName() + "<br>"; 
    	}
    	
    	msg += "</body></html>";
    	
        return Response.status(200).entity(msg).build();
    }

/*
    @Path("json")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<StdApplication> getJSONApps() throws Exception {
    	
    	List<StdApplication> apps = new ArrayList<>();
    	
    	List<StdApplication> appList = new ArrayList<StdApplication>();
    	appList = ApplicationDao.readAll();

    	for(StdApplication app : appList){
    		StdApplication a = new StdApplication();
    		
    		a.setApplicationId(app.getApplicationId());
        	a.setApplicationName(app.getApplicationName());
        	a.setCreateDate(app.getCreateDate());
        	a.setExpireDate(app.getExpireDate());
        	
        	apps.add(a);
    	}
    	System.out.println("getJSON(): found " + appList.size() + " message(s) on DB");
    	
    	return apps;
    }
*/
    
    @Path("response")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getResponse() throws Exception {
    	
    	List<StdApplication> appList = new ArrayList<StdApplication>();
    	
    	ApplicationDao dao = new ApplicationDao();
    	appList = dao.readAll();

    	System.out.println("getJSON(): found " + appList.size() + " message(s) on DB");
    	
    	return Response.status(200).entity(appList).build();

    }


}
