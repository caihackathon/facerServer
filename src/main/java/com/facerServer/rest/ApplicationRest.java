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
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAll() throws Exception {    	
    	List<StdApplication> appList = new ArrayList<StdApplication>();
    	appList = ApplicationDao.readAll();
    	return Response.status(200).entity(appList).build();
    }

    @Path("active")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getActive() throws Exception {    	
    	List<StdApplication> appList = new ArrayList<StdApplication>();
    	appList = ApplicationDao.readActive();
    	return Response.status(200).entity(appList).build();
    }

}