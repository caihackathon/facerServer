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

@Path("example")
public class ExampleRest {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getText() {

    	List<StdApplication> appList = new ArrayList<StdApplication>();

    	appList = ApplicationDao.readAll();

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

    	appList = ApplicationDao.readAll();

    	for (StdApplication app : appList) {
    		msg = msg + app.getApplicationId() + " - " + app.getApplicationName() + "<br>"; 
    	}
    	
    	msg += "</body></html>";
    	
        return Response.status(200).entity(msg).build();
    }

/*
    @Path("om")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getOM() throws Exception {
  
    	ObjectMapper om = new ObjectMapper();
    	
    	String carJson = "{ \"brand\" : \"Mercedes\", \"doors\" : 5 }";
   
   // 		Car car = objectMapper.
    	
    	try {
    		
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    	
 //   	ApplicationDao appDao = new ApplicationDao();
 //   	List appList = appDao.readAll();

 //   	System.out.println("getList(): found " + appList.size() + " message(s) on DB");  	
    	
    	return Response.status(200).entity(om).build();;
    }
*/
    
    @Path("list")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<StdApplication> getList() throws Exception {
  
    	List<StdApplication> appList = ApplicationDao.readAll();

    	System.out.println("getList(): found " + appList.size() + " message(s) on DB");  	
    	
    	return appList;
    }

    @Path("response")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getResponse() throws Exception {
    	
    	List<StdApplication> appList = new ArrayList<StdApplication>();

    	appList = ApplicationDao.readAll();

    	System.out.println("getResponse(): found " + appList.size() + " message(s) on DB");    	
    	return Response.status(200).entity(appList).build();
    }
}
